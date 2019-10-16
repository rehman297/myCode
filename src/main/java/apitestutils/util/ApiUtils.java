package apitestutils.util;

import com.google.gson.Gson;
import apitestutils.broadcastSheduleApi.BroadcastSheduleModel;
import io.restassured.response.Response;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import static io.restassured.RestAssured.given;


public class ApiUtils {

	
	public static BroadcastSheduleModel getBrScheduleResponseModel() {
        Response response = given()
                .log()
                .all()
                .get("https://kplus-epg-stag.azureedge.net/kplus/1.4/Content/ProgramGuideCDN?startDateTime="+getTimeStampInUtc()+"&startWithinMinutes=1440&channelIds=400000001,400000002,400000003,400000004,400000027,400000005,400000006,400000007&language=eng&t="+getTimeStampInUtc());

        Gson gson = new Gson();
        BroadcastSheduleModel oBroadcastSheduleModel
                = gson.fromJson(response.getBody().asString(), BroadcastSheduleModel.class);

        return oBroadcastSheduleModel;
    }
	
	public static String getTimeStampInUtc(){
		
		SimpleDateFormat dateFormatUtc = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		dateFormatUtc.setTimeZone(TimeZone.getTimeZone("UTC"));
		
		Calendar currentDate = Calendar.getInstance();
		currentDate.set(Calendar.HOUR_OF_DAY, 0);
		currentDate.set(Calendar.MINUTE, 0);
		currentDate.set(Calendar.SECOND, 0);
		currentDate.set(Calendar.MILLISECOND, 0);
		return dateFormatUtc.format(currentDate.getTime());

	}

	public static String getTimeStampInIst(String dateTime) throws ParseException{
		
		String finalDate="";
		
		try {
			
			SimpleDateFormat dateFormatUtc = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
			Date utcDate = dateFormatUtc.parse(dateTime);
			
			SimpleDateFormat dateFormatIst = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			dateFormatIst.setTimeZone(TimeZone.getTimeZone("IST"));
			
			Calendar currentDate = Calendar.getInstance();
			currentDate.set(Calendar.HOUR_OF_DAY, (utcDate.getHours()+5));
			currentDate.set(Calendar.MINUTE, (utcDate.getMinutes()+30));
			currentDate.set(Calendar.SECOND, 0);
			currentDate.set(Calendar.MILLISECOND, 0);
			finalDate=currentDate.getTime().getHours()+":"+currentDate.getTime().getMinutes();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//return dateFormatIst.format(currentDate.getTime());
		return finalDate;
	}

}
