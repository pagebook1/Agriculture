import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class currentDateTime {

public String currentDateTime() {
	// TODO Auto-generated method stub
	LocalDateTime localDateTime = LocalDateTime.now();
	return localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	}
}
