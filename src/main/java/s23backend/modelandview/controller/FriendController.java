package s23backend.modelandview.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import s23backend.modelandview.domain.Friend;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FriendController {

    private List<Friend> kaverit = new ArrayList<>();

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("friend", new Friend());
        model.addAttribute("kaverit", kaverit);
        return "FriendList";
    }

    @PostMapping("/addFriend")
    public String addFriend(@ModelAttribute Friend friend) {
        kaverit.add(friend);
        return "redirect:/index";
    }
}
