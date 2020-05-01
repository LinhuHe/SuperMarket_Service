package cqdx.finall.supertmarket.Controller;

import cqdx.finall.supertmarket.Service.UserInfoService;
import cqdx.finall.supertmarket.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.sound.midi.SysexMessage;

@RestController
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;

    @RequestMapping("/UserInfoController/getUserInfo/{uid}")
    public UserInfo getUserInfo(@PathVariable("uid") String uid)
    {
        System.out.println("UserInfoController/getUserInfo uid="+uid);
        return userInfoService.getUserInfo(uid);
    }

    @RequestMapping("/UserInfoController/checkAndAddMyInfo")  //检查不存在则插入 存在则无操作 然后返回
    public UserInfo checkAndAddMyInfo(@RequestParam("uid") String uid,@RequestParam("nickname") String nickname,
                              @RequestParam("sex") int sex,@RequestParam("ip") String ip, @RequestParam("portrait") String portrait)
    {
        System.out.println("UserInfoController/checkAndAddMyInfo uid="+uid+ "  nickname="+nickname+"  sex="+sex+ "  ip="+ip+"  portrait = "+portrait);
        return userInfoService.checkAndAddMyInfo(uid,nickname,sex,ip,portrait);
    }

    @RequestMapping("/UserInfoController/changeProtrait")
    public void changeProtrait(@RequestParam("portrait") MultipartFile portrait,@RequestParam("userName") String userName,@RequestParam("uid") String uid)
    {
        System.out.println("UserInfoController/changeProtrait uid="+uid+ "  userName="+userName+  "  portrait = "+portrait);
        userInfoService.changeProtrait(portrait,userName,uid);
    }

    @RequestMapping("/UserInfoController/changeNickname")
    public int changeNickname(@RequestParam("newNickname") String newNickname,@RequestParam("uid") String uid)
    {
        System.out.println("UserInfoController/changeNickname uid="+uid+ "  newNickname="+newNickname);
        return userInfoService.changeNickname(newNickname,uid);
    }
}
