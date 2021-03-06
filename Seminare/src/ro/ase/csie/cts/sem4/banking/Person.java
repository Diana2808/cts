package ro.ase.csie.cts.sem4.banking;

import java.util.Date;

public class Person {

	private String name;
	private String adress;
	private Date birthDate;
	private long salary;
	private String email;
	private String mobile;
	private Integer age;
	
	//preferinta utilizator 
	private NotificationType notificationType;
	
	public static enum NotificationType{
		EMAIL
		
 {
			@Override
			public NotificationService getNotificationService() {
				// TODO Auto-generated method stub
				return new EmailNotificationService();
			}
		},
 	SMS
 {
			@Override
			public NotificationService getNotificationService() {
				// TODO Auto-generated method stub
				return new SMSNotificationService();
			}
		};
		
		public abstract NotificationService getNotificationService();
	}
	
	
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Person(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public NotificationType getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(NotificationType notificationType) {
		this.notificationType = notificationType;
	}
	
	
	
	
}
