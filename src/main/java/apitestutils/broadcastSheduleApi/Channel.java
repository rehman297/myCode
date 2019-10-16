package apitestutils.broadcastSheduleApi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Channel {

	@SerializedName("ChannelId")
	@Expose
	private String channelId;
	@SerializedName("Title")
	@Expose
	private String title;
	@SerializedName("Type")
	@Expose
	private String type;
	@SerializedName("Description")
	@Expose
	private String description;
	@SerializedName("Image")
	@Expose
	private String image;
	@SerializedName("Programs")
	@Expose
	private List<Program> programs = null;

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<Program> getPrograms() {
		return programs;
	}

	public void setPrograms(List<Program> programs) {
		this.programs = programs;
	}
}
