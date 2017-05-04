package pojo;

import java.sql.Date;

public class Event {

	private Date date;
	private String topic;
	private String presenter;
	
	public Event(Date date, String topic, String presenter) {
		super();
		this.date = date;
		this.topic = topic;
		this.presenter = presenter;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getPresenter() {
		return presenter;
	}

	public void setPresenter(String presenter) {
		this.presenter = presenter;
	}

	@Override
	public String toString() {
		return "Event [date=" + date + ", topic=" + topic + ", presenter=" + presenter + "]";
	}
	
	
	
}
