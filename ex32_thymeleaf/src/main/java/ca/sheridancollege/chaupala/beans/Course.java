package ca.sheridancollege.chaupala.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {

	
	    private Long id;
	    private String prefix;
	    private Long code;
	    private String name;
	

	
}
