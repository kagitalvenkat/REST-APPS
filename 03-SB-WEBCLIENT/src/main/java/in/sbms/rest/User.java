package in.sbms.rest;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private Integer page;
	private Integer total_pages;
	private Integer total;
	private Data[] data;
	private Support support;
}
