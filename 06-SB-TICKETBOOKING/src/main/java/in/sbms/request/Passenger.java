package in.sbms.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {
	
	private String firstName;
	private String lastName;
	private String from;
	private String to;
	private String doj;

}
