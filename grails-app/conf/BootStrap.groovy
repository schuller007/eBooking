import grails.util.GrailsUtil

import com.cambian.User

class BootStrap {

	def init = { servletContext ->
		switch(GrailsUtil.environment){
		  case "development":
		   createUsers()
			
		  break
	
		  case "production":
		  	createUsers()
		  break
		}	
	  }
	
    def destroy = {
    }
	
	def createUsers() {
		def password = "password".encodeAsPassword()
		def admin = new User(login:"admin@cambian.com",
							 password:password,
							 title:"Mr.",
							 lastName:"Admin",
							 firstName:"Cambian",
							 role:"Admin")
		admin.save()
		
		
		def gp = new User(login:"gp@cambian.com",
							 password:password,
							 title:"Dr.",
							 lastName:"Doctor",
							 firstName:"Family",
							 role:"GP")
		gp.save()
		
		def surgeon = new User(login:"surgeon@cambian.com",
			password:password,
			title:"Dr.",
			lastName:"Doctor",
			firstName:"Surgeon",
			role:"Surgeon")
		surgeon.save()
	}
}

