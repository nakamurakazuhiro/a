package com.example.demo.animals.animalsController;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.animals.animalsService.AnimalsService;
import com.example.demo.sampleAPI.data.Animals;


@Controller
public class AnimalsController {

	private final AnimalsService animalsservice;

	public AnimalsController(AnimalsService animalsservice) {
		this.animalsservice = animalsservice;
	}

	@GetMapping("animalsSearch")
	public String getAnimalsindex(Model model) throws IOException {
		
		List<Animals> animalsSearch = animalsservice.getAnimalsName();

		model.addAttribute("animalsSearch", animalsSearch);
		
		return "animalsSearch";
	}

	
	@GetMapping("animalsDetail")
	public String getAnimals(@RequestParam("animalsSearch")String animalId, Model model) throws IOException {

		Animals[] animalsDetail = animalsservice.getAnimalById(animalId);

		model.addAttribute("animalsDetail", animalsDetail);

		return "animalsDetail";
	}

}
