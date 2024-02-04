package Hospital;
public class Receptionist {
String rid;
String rname;
private String pid;
public Receptionist(String rid, String rname ) {
// TODO Auto-generated constructor stub
this.rid = this.rid;
this.rname = this.rname;
}
@Override public String toString1()
{ // TODO Auto-generated method stub
return rid +", "+rname; }
public Bill payBill(int billid, double ammount)
{
return new Bill(billid, this, ammount); }
// use toString Method for string representation of Patient Object
@Override public String toString()
{ // TODO Auto-generated method stub
return pid +", "+pname + ", "+ age + ", "+ gender+ ", "+ roomno; 



}}
