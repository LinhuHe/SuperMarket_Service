package cqdx.finall.supertmarket.Controller;

import cqdx.finall.supertmarket.Service.UserInfoService;
import cqdx.finall.supertmarket.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.SysexMessage;

@RestController
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;

    @RequestMapping("/UserInfoController/checkAndAddMyInfo")  //检查不存在则插入 存在则无操作 然后返回
    public UserInfo checkAndAddMyInfo(@RequestParam("uid") String uid,@RequestParam("nickname") String nickname,
                              @RequestParam("sex") int sex,@RequestParam("ip") String ip, @RequestParam("portrait") String portrait)
    {
        System.out.println("UserInfoController/checkAndAddMyInfo uid="+uid+ "  nickname="+nickname+"  sex="+sex+ "  ip="+ip+"  portrait = "+portrait);
        return userInfoService.checkAndAddMyInfo(uid,nickname,sex,ip,portrait);
    }
}
