package ebooking

class LoginTagLib {
	def loginControl = {
		if(session.user){
		  out << "Hello ${session.user} "
		  out << """[${link(action:"logout", controller:"user"){"Logout"}}]"""
		} 
	  }
}
