

	public class Person {
		String firstname;
		String secondname;
		char gender;
		
		public Person(String fn,String ln,char g)
		{
			this.firstname=fn;
			this.secondname=ln;
			this.gender=g;
		}
		
		public String getFirstname() {
			return firstname;
		}
	 
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
	 
		public String getSecondname() {
			return secondname;
		}
	 
		public void setSecondname(String secondname) {
			this.secondname = secondname;
		}
	 
		public char getGender() {
			return gender;
		}
	 
		public void setGender(char gender) {
			this.gender = gender;
		}
	 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Person p = new Person("tushar","garg",'M');
			System.out.println(p);
			
			
			
		}
	 
	}

