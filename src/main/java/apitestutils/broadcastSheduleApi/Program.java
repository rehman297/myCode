package apitestutils.broadcastSheduleApi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Program {

	@SerializedName("ContentId")
	@Expose
	private String contentId;
	@SerializedName("LinearStartDateTime")
	@Expose
	private String linearStartDateTime;
	@SerializedName("Title")
	@Expose
	private String title;
	@SerializedName("Description")
	@Expose
	private String description;
	@SerializedName("Genres")
	@Expose
	private List<String> genres = null;
	@SerializedName("Year")
	@Expose
	private String year;
	@SerializedName("DurationSeconds")
	@Expose
	private String durationSeconds;
	

	public String getContentId() {
		return contentId;
	}

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getLinearStartDateTime() {
		return linearStartDateTime;
	}

	public void setLinearStartDateTime(String linearStartDateTime) {
		this.linearStartDateTime = linearStartDateTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDurationSeconds() {
		return durationSeconds;
	}

	public void setDurationSeconds(String durationSeconds) {
		this.durationSeconds = durationSeconds;
	}


}
