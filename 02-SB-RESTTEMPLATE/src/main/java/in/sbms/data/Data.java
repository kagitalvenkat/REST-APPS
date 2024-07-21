package in.sbms.data;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class Data {
	private Integer id;
	private String name;
	private String year;
	private String color;
	private String pantone_value;
	
	//UserData userData;

}
