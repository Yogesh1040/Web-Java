package p1.p2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.commons.Coach;

@RestController
@RequestMapping("/api")
public class CoachRestController {

	@Autowired
	private Coach coach;
	//private Coach theCoach;
	
	
	/*
	 * @Autowired public CoachRestController(@Qualifier("tennisCoach") Coach coach)
	 * { System.out.println("In Para"); this.coach = coach; }
	 */
	
	/*
	 * @Autowired public CoachRestController(Coach coach) {
	 * System.out.println("In para"); this.coach = coach; }
	 */
	
	/*
	 * public CoachRestController(Coach coach, Coach theCoach) {
	 * System.out.println("In Para"); this.coach = coach; this.theCoach = theCoach;
	 * }
	 */

	//@Autowired
	public void setCoach(Coach coach) {
		System.out.println("In setter");
		this.coach = coach;
	}
	
	//@Autowired
	public void set(Coach coach)
	{
		System.out.println("In Setter");
		this.coach = coach;
	}
	
	
	  @GetMapping("/dailyWorkout") public String getDailyWorkout() { return
	  "coach.getDailyWorkout() "+"coach=theCoach ";}
			  
	  //+(coach==theCoach); }
	 
	
	
}
