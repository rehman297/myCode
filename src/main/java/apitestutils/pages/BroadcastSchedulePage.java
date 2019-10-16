package apitestutils.pages;

import apitestutils.util.ApiUtils;
import apitestutils.util.CommonFunctions;
import apitestutils.base.TestBase;
import apitestutils.broadcastSheduleApi.BroadcastSheduleModel;
import apitestutils.broadcastSheduleApi.Channel;

import java.util.LinkedHashMap;
import java.util.Map;

public class BroadcastSchedulePage extends TestBase {
	
	
	CommonFunctions comFuncObj=null;
	BroadcastSheduleModel oBroadcastSheduleModel=null;
	
	public BroadcastSchedulePage(){
		
		comFuncObj=new CommonFunctions();
		
	}
		
	/**
	 * @param
	 * @return true/false
	 * description: Function to switch between main menu items
	 */
	
	@SuppressWarnings("unchecked")
	public boolean verifyBrScheduleContent() {

		boolean isBrScheduleContent=false;
		Map<String, String> brScheduleMapApi=new LinkedHashMap<String, String>();	
		oBroadcastSheduleModel= ApiUtils.getBrScheduleResponseModel();
		
		try {

			for(Channel channelData : oBroadcastSheduleModel.getChannels()){

				if(!channelData.getPrograms().isEmpty()){
					brScheduleMapApi.put(channelData.getPrograms().get(0).getTitle(), ApiUtils.getTimeStampInIst(channelData.getPrograms().get(0).getLinearStartDateTime()));
				}

			}
			isBrScheduleContent= !brScheduleMapApi.values().isEmpty();

		} catch (Exception e) {
			isBrScheduleContent=false;
			e.printStackTrace();
		}

		return isBrScheduleContent;
	}

}
