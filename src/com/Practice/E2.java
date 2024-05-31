package com.Practice;

public class E2 {

		int id;
		String name;
		String address;
		
		public void setid(int id) {
			this.id=id;
		}
		public int getid() {
			return id;
		}
		public void  setname(String name) {
			this.name=name;
		}
		public String getname() {
			return name;
		}
		public void setaddress(String address) {
			this.address=address;
		}
		public String getaddress() {
			return address;
		}
		@Override
		public String toString() {
			return "E1 [id=" + id + ", name=" + name + ", address=" + address + "]";
		}
		


}
