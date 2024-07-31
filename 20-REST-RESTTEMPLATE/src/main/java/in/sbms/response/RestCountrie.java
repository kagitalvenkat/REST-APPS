package in.sbms.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RestCountrie{
	private Name name;
	private String region;
	private String[] capital;
	private String subregion;
	private Languages languages;
	private String[] borders;
	private Long population;
	private Flags flags;
	
	//private List<RestCountries> restCountries;
}
