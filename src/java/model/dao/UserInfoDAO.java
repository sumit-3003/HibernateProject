package model.dao;

import java.util.List;
import model.pojo.Userinfo;
import model.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
public class UserInfoDAO {
   public static List<Userinfo> getUsers()
   {
       List<Userinfo> lst=null;
       try{
           Session session=HibernateUtil.getSessionFactory().openSession();
           //code to get all users data
           String hql="from Userinfo";
           Query query=session.createQuery(hql);
           lst=query.list();
           session.close();
       }
       catch(Exception e){
           e.printStackTrace();
       }
       return lst;
   }
}
