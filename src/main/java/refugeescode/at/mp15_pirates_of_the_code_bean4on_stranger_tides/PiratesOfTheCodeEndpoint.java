package refugeescode.at.mp15_pirates_of_the_code_bean4on_stranger_tides;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PiratesOfTheCodeEndpoint {

    private boolean isMermaidFound;
    private boolean isTheTearsHaveTaken;
    private boolean isChalliceFound;
    private boolean isdrinkTearFromTheChallice;

    @GetMapping
    public String page(){
        return "home";
    }

    @ModelAttribute("isMermaidFound")
     public boolean searchForMermaid(){
        return isMermaidFound;
    }
    @ModelAttribute("isTheTearsHaveTaken")
    public boolean getTheTears(){
        return isTheTearsHaveTaken;
    }
    @ModelAttribute("isChalliceFound")
    public boolean findTheChallice(){
        return isChalliceFound;
    }
    @ModelAttribute("isdrinkTearFromTheChallice")
    public boolean drinkTearsInChallice(){
        return isdrinkTearFromTheChallice;
    }
    @GetMapping("/stepOneMermaid")
    String mermaid() {
        isMermaidFound = true;
        return "redirect:/";
    }
    @GetMapping("/stepTwoTheTears")
    String tears() {
        isTheTearsHaveTaken = true;
        return "redirect:/";
    }
    @GetMapping("/stepThreeTheChallice")
    String challice() {
        isChalliceFound = true;
        return "redirect:/";
    }
    @GetMapping("/stepFourDrinkTheTearsInTheChallice")
    String drinkingTears() {
        isdrinkTearFromTheChallice = true;
        return "redirect:/";
    }







}
