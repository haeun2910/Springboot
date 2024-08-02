package com.example.demo.thyme;

import com.example.demo.Food;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Practice {
    @RequestMapping("food-place")
    public String place(Model model) {
        List<Food> foods = List.of(
                new Food("갈비탕","김밥천국"),
                new Food("연어샐러드","refresh again"),
                new Food("돈잔국수", "돈까스 가게"),
                new Food("제육볶음밥","refresh again")
        );
        for(Food food : foods) {}
        model.addAttribute("foods", foods);
        return "foodplace.html";

    }
}
