package in.sbms.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
	private String pnr;
	private String ticketStatus;
	private Double ticketPrice;
}
