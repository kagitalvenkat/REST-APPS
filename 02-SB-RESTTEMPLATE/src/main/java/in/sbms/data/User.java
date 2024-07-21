package in.sbms.data;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private Integer page;
	private Integer total;
	private Data[] data;
}
