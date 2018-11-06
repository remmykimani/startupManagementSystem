public class Users
{
  private int userID,authority,startupID;
  private String userName;
  
  public Users(int userID,String userName,int startupID,int authority)
          {
              this.userID=userID;
              this.userName=userName;
              this.startupID=startupID;
              this.authority=authority;
          }
    public int getUserId()
    {
            return userID;
    }
    public String getUserNane()
    {
        return userName;
    }
    public int getStartupID()
            {
                return startupID;
            }
    public int getAuthority()
    {
        return authority;
    }
}

