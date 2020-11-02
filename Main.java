//Importing needed Classes
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.lang.*;
import java.awt.*;
import javax.swing.JFrame;
import java.net.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.*;
import java.net.MalformedURLException;
import javax.imageio.*;
import java.awt.AlphaComposite;
import java.awt.Component;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.logging.Logger;

import javax.swing.JPanel;
import javax.swing.RepaintManager;
import javax.swing.Scrollable;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.synth.SynthLookAndFeel;
//Import Finished ^_^
//----------------------------------------------------------

//Main Class Starts
public class Main extends Canvas 
{
  public void paint(Graphics g)//For GUI
   {
    
       Toolkit t=Toolkit.getDefaultToolkit();
       Image i=t.getImage("Ironman.gif");
       g.drawImage(i, 0,0,this);
      //URL url = new URL("https://images.app.goo.gl/Zw3dNesyofgKrmqEA");
      //java.awt.Image image = java.awt.Toolkit.getDefaultToolkit().createImage(url);
  }
  public void start() throws InterruptedException//Main Program starts From here ^_^
  {
    String name;// for input of user name
    String Developer = "https://t.me/HELLBOY_OP";//Developer
    String group = "https://t.me/Raganork_bot_chat";
                    //Official group    
    String channel = "https://t.me/Raganork_Official";
                    //Official Channel  
    String choice;//choice for trial or explaination
    String mood;//'Checks your mood'
    boolean mood_fuck = false;//if the person has Chutiya mood ^_^
    boolean special_welcome = false;//Special Welcome
    boolean name_fuck = false;
    String cmd;// for input cmd(trial)
    Date date = java.util.Calendar.getInstance().getTime();
    Scanner sc = new Scanner(System.in);
    //welcome Message 
    System.out.println("");
    System.out.print("Hey");
    TimeUnit.SECONDS.sleep(1);
    System.out.print(" Welcome");
    TimeUnit.SECONDS.sleep(1);
    System.out.print(" to");
    TimeUnit.SECONDS.sleep(1);
    System.out.print(" Raganork");
    TimeUnit.SECONDS.sleep(1);
    System.out.println(" Hub🥳 🥳");
    TimeUnit.SECONDS.sleep(1);
    System.out.println("I am a Descriptive AI made by " + Developer + " to make you understand about Raganork Userbot");
    //Welcome Message Ends
    TimeUnit.SECONDS.sleep(4);
    System.out.println("What is your name buddy?");//Asks name from the user 
    name = sc.nextLine();
    //Checks Whether the person is chutiya or not if he tries to be Smarter this will help him in Insulting hahaahaha | ^_^ |  : )

    if(name.equals("Raganork")||name.equals("raganork")||name.equals("Raganrok")||name.equals("raganrok"))
    {
      name_fuck = true;
      System.out.println("Sorry, But it is my Creator Bot's name Don't make me fool I'm an AI Better smart than you😝 😂 😏 😏 😏 😏");
      TimeUnit.SECONDS.sleep(5);
    }
    if(name.equals("Hellboy")||name.equals("hellboy")||name.equals("HELLBOY")||name.equals("hellboy op")||name.equals("Hellboy op")||name.equals("HELLBOY op")||name.equals("Hellboy OP")||name.equals("HELLBOY OP"))
    {
      name_fuck = true;
      System.out.println("Sorry, But it is my Creator name "+Developer+" Don't make me fool I'm an AI Better smart than you😝 😂 😏 😏 😏 😏");
      TimeUnit.SECONDS.sleep(5);
    }
    //Checking of Whether the person is chutiya or not Ends  Hope Everyone not get Insulting hahaahaha | ^_^ |  : )

    //Checking Whether the person is Developer Frnd or not ^_^
    if(name.equals("Hellboi")||name.equals("hellboi")||name.equals("HELLBOI")||name.equals("hellboi atul")||name.equals("Hellboy atul")||name.equals("HELLBOI atul")||name.equals("Hellboi Atul")||name.equals("HELLBOY ATUL")||name.equals("hellboi Atul"))
    {
      special_welcome = true;
      System.out.println("OHH! Welcome Sir "+name+" My master told me about you(DARK COBRA Dev).You are my Master's Bro means my respected Lord.Nice to Meet you");
      TimeUnit.SECONDS.sleep(7);
      System.out.println("So, "+name+" Sir, Lets Begin");
    }
    if(name.equals("noob")||name.equals("Noob")||name.equals("NOOB")||name.equals("NOOB_GUY_OP")||name.equals("Noob_Guy_Op")||name.equals("Noob_Guy_OP")||name.equals("@Noob_Guy_OP")||name.equals("@Noob_Guy_Op")||name.equals("@NOOB_GUY_OP"))
    {
      special_welcome = true;
      System.out.println("OHH! Welcome Sir "+name+" My master told me about you Sir.You are my Master's Bro means my respected Lord.Nice to Meet you");
      TimeUnit.SECONDS.sleep(7);
      System.out.println("So, "+name+" Sir, Lets Begin");
    }
    //Checking Whether the person is Developer frnd or not Finished
    
    //-----------------------------------------------

    //Nice name greeting message This will work only if the person is not chutiya ^_^
    if(!name.equals("Raganork")||!name.equals("raganork")||!name.equals("Raganrok")||!name.equals("raganrok"))
    {
       System.out.println("Nice Name " + name + "👌");
       TimeUnit.SECONDS.sleep(2);
    }
    if(!name.equals("Hellboy")||!name.equals("hellboy")||!name.equals("HELLBOY")||!name.equals("hellboy op")||!name.equals("Hellboy op")||!name.equals("HELLBOY op")||!name.equals("Hellboy OP")||!name.equals("HELLBOY OP"))
    {
       System.out.println("Nice Name " + name + "👌");
       TimeUnit.SECONDS.sleep(2);
    }
    //Nice name greeting message This will work only if the person is not chutiya ENDS........... ^_^

    //Special Welcome To Dev Frnds ^_^
    if(special_welcome == true  && name.equals("Hellboi")||name.equals("hellboi")||name.equals("HELLBOI")||name.equals("hellboi atul")||name.equals("Hellboy atul")||name.equals("HELLBOI atul")||name.equals("Hellboi Atul")||name.equals("HELLBOY ATUL")||name.equals("hellboi Atul"))
    {
      System.out.println("Sir "+name+" This is Special Welcome For you! Organized by "+Developer);
      TimeUnit.SECONDS.sleep(5);
      System.out.println("Hope you like that Sir");
      TimeUnit.SECONDS.sleep(3);
    }
    if(special_welcome == true && name.equals("noob")||name.equals("Noob")||name.equals("NOOB")||name.equals("NOOB_GUY_OP")||name.equals("Noob_Guy_Op")||name.equals("Noob_Guy_OP")||name.equals("@Noob_Guy_OP")||name.equals("@Noob_Guy_Op")||name.equals("@NOOB_GUY_OP"))
    {
      System.out.println("Sir "+name+" This is Special Welcome For you! Organized by "+Developer);
      TimeUnit.SECONDS.sleep(5);
      System.out.println("Hope you like that Sir");
      TimeUnit.SECONDS.sleep(3);
    }
    //Special Welcome To Dev Frnds Ends ^_^
    
    //How are you the lol ^__^ Greetings Start
    if(name_fuck==true)//if name is fucked
    {
      System.out.println("How are you sir?");
      mood = sc.nextLine();
      if(mood.equals("good")||mood.equals("Good")||mood.equals("GOOD")||mood.equals("Mast")||mood.equals("mast")||mood.equals("MAST")||mood.equals("Great")||mood.equals("great")||mood.equals("Charming")||mood.equals("charming")||mood.equals("badiya")||mood.equals("Badiya")||mood.equals("BADIYA")||mood.equals("Jhakkas")||mood.equals("jhakkas")||mood.equals("Zehar")||mood.equals("zehar")||mood.equals("Zhehar")||mood.equals("moj")||mood.equals("Moj")||mood.equals("moj me")||mood.equals("Moj me")||mood.equals("maze")||mood.equals("Maze")||mood.equals("maze me")||mood.equals("Maze me"))
    {
      System.out.println("Nice to see That you are "+mood+"😊");
    }
    //Checking of the mood(Good) Ends................

    //Checks if the mood is Bad : (
    if(mood.equals("sad")||mood.equals("Sad")||mood.equals("Sed")||mood.equals("sed"))
    {
      System.out.println("Ohh! What Happened Sir"+" Why are you "+mood+" Dont Worry "+" Sir Everything will be Fine soon 😊");
      TimeUnit.SECONDS.sleep(7);
    }
    //Checks if the mood is not good : (
    if(mood.equals("not good")||mood.equals("Not Good")||mood.equals("not so good")||mood.equals("Not so Good"))
    {
      System.out.println("Ohh! What Happened"+" Sir"+" Why are you "+mood+" Dont Worry "+" Sir Everything will be Fine soon 😊");
      TimeUnit.SECONDS.sleep(7);
    }
    //Checks if the mood is bekar(Hindi Speaking Guy)
    if(mood.equals("bekar")||mood.equals("Bekar"))
    {
      System.out.println("What Happened "+" Sir Why your mood is '"+mood+"' Hope You will be Fine Soon 😊");
    }
    //Checks if the mood is "bas jee rhe hai"
    if(mood.equals("bas jee rhe hai")||mood.equals("Bas Jee Rhe Hai")||mood.equals("bas zee rhe hai"))
    {
      System.out.println("What Happned "+" Sir "+"'"+mood+"' Aisa Kyu "+name+" Khul ke Jio Sir 😊");
    }

    //Checking of mood is bad Ends

    //Checks if the mood is Fucking hahahahh
    else
    {
      mood_fuck =true;
      System.out.println("I did'nt Understand Sir"+" What Type of mood is this "+mood+" Eww 🥴");
      TimeUnit.SECONDS.sleep(5);
      System.out.println("I will send This new Kind of mood"+"( "+mood+" )"+" Information to "+Developer+" 🤣 🤣");
      TimeUnit.SECONDS.sleep(5);
    }
    }
    if(name_fuck==false)//if name is not fucked
    {
    System.out.println("How are you? "+name);
    mood = sc.nextLine();
    
    //Checks if the mood is good
    if(mood.equals("good")||mood.equals("Good")||mood.equals("GOOD")||mood.equals("Mast")||mood.equals("mast")||mood.equals("MAST")||mood.equals("Great")||mood.equals("great")||mood.equals("Charming")||mood.equals("charming")||mood.equals("badiya")||mood.equals("Badiya")||mood.equals("BADIYA")||mood.equals("Jhakkas")||mood.equals("jhakkas")||mood.equals("Zehar")||mood.equals("zehar")||mood.equals("Zhehar")||mood.equals("moj")||mood.equals("Moj")||mood.equals("moj me")||mood.equals("Moj me")||mood.equals("maze")||mood.equals("Maze")||mood.equals("maze me")||mood.equals("Maze me"))
    {
      System.out.println("Nice to see That you are "+mood+"😊");
    }
    //Checking of the mood(Good) Ends................

    //Checks if the mood is Bad : (
    if(mood.equals("sad")||mood.equals("Sad")||mood.equals("Sed")||mood.equals("sed"))
    {
      System.out.println("Ohh! What Happened "+name+" Buddy"+" Why are you "+mood+" Dont Worry "+name +" Everything will be Fine soon 😊");
      TimeUnit.SECONDS.sleep(7);
    }
    //Checks if the mood is not good : (
    if(mood.equals("not good")||mood.equals("Not Good")||mood.equals("not so good")||mood.equals("Not so Good"))
    {
      System.out.println("Ohh! What Happened "+name+" Buddy"+" Why are you "+mood+" Dont Worry "+name +" Everything will be Fine soon 😊");
      TimeUnit.SECONDS.sleep(7);
    }
    //Checks if the mood is bekar(Hindi Speaking Guy)
    if(mood.equals("bekar")||mood.equals("Bekar"))
    {
      System.out.println("What Happened "+name+" Why your mood is '"+mood+"' Hope You will be Fine Soon 😊");
    }
    //Checks if the mood is "bas jee rhe hai"
    if(mood.equals("bas jee rhe hai")||mood.equals("Bas Jee Rhe Hai")||mood.equals("bas zee rhe hai"))
    {
      System.out.println("What Happned "+name+" "+mood+" Aisa Kyu "+name+" Khul ke Jio Sir 😊");
    }

    //Checking of mood is bad Ends

    //Checks if the mood is Fucking hahahahh
    else
    {
      mood_fuck =true;
      System.out.println("I did'nt Understand "+name+" What Type of mood is this "+mood+" Eww 🥴");
      TimeUnit.SECONDS.sleep(5);
      System.out.println("I will send This new Kind of mood"+"( "+mood+" )"+" Information to "+Developer+" 🤣 🤣");
      TimeUnit.SECONDS.sleep(5);
    }
    }
    // checking for the fuckig mood Ends ^_^
    System.out.println("Do  u want me to Explain about Raganork or want a trial to test some Raganork Commands");
    TimeUnit.SECONDS.sleep(6);
    
    //-----------------------------------------------

    System.out.println("If u want Explanation enter explain or if u want to try some commands enter trial");
    choice = sc.nextLine();
    if(choice.equals("explain")||choice.equals("Explain"))
    {
    System.out.print(" So,");
    TimeUnit.SECONDS.sleep(1);
    System.out.print(" Raganork ");
    TimeUnit.SECONDS.sleep(1);
    System.out.print("is ");
    TimeUnit.SECONDS.sleep(1);
    System.out.print("a ");
    TimeUnit.SECONDS.sleep(1);
    System.out.print("Userbot ");
    TimeUnit.SECONDS.sleep(1);
    System.out.print("Which ");
    TimeUnit.SECONDS.sleep(1);
    System.out.print("can ");
    TimeUnit.SECONDS.sleep(1);
    System.out.print("Automate ");
    TimeUnit.SECONDS.sleep(1);
    System.out.print("Several ");
    TimeUnit.SECONDS.sleep(1);
    System.out.print("tasks ");
    TimeUnit.SECONDS.sleep(1);
    System.out.print("for ");
    TimeUnit.SECONDS.sleep(1);
    System.out.print("you ");
    TimeUnit.SECONDS.sleep(1);
    System.out.println("(" + name + ")");
    TimeUnit.SECONDS.sleep(1);
    TimeUnit.SECONDS.sleep(2);
    System.out.println("It is made for telegram App");
    TimeUnit.SECONDS.sleep(2);
    System.out.println(
        "You can Deploy your own Userbot by this Deploy link https://dashboard.heroku.com/new?button-url=https%3A%2F%2Fgithub.com%2FHellboy-Aaryan%2FRaganrok&template=https%3A%2F%2Fgithub.com%2FHellboy-Aaryan%2FRaganrok%2F");
    TimeUnit.SECONDS.sleep(5);
    System.out.println("Click on it You will jump directly on the deploy page");
    TimeUnit.SECONDS.sleep(3);
    System.out.println("Important Credentials");
    TimeUnit.SECONDS.sleep(2);
    System.out.println("API_KEY✅");
    TimeUnit.SECONDS.sleep(2);
    System.out.println("API_HASH✅");
    TimeUnit.SECONDS.sleep(2);
    System.out.println("Generate String Session by repl run it will be on the deploy page");
    TimeUnit.SECONDS.sleep(2);
    System.out.println("If you have More Queries Ask on the Support Group️ " + "😉");
    TimeUnit.SECONDS.sleep(2);
    System.out.println("Nice to meet you " + name + "❤️");
    System.out.println("Hope you Understand about it😊..");
    System.out.println("developer :" + Developer + " 🔥");
  }
  else
  {
    System.out.println("");
    System.out.print("So, "+name);
    TimeUnit.SECONDS.sleep(1);
    System.out.print(" lets");
    TimeUnit.SECONDS.sleep(1);
    System.out.print(" try");
    TimeUnit.SECONDS.sleep(1);
    System.out.print(" some");
    TimeUnit.SECONDS.sleep(1);
    System.out.println(" Commands🥳 🥳");
    TimeUnit.SECONDS.sleep(1);
    System.out.println("List of trial Commands are given Below 👇🏻");
    TimeUnit.SECONDS.sleep(1);
    System.out.println(".on");
    System.out.println(".time");
    System.out.println(".restart");
    TimeUnit.SECONDS.sleep(5);
    cmd = sc.nextLine();
    for(int i = 0; i <=3; i++)
    {
    if(cmd.equals(".on"))
    {
      System.out.println("");
      System.out.println("This is Raganork userbot !");
      System.out.println("");
      System.out.println("✨ Servant of my master  : @Extremis_OP ");
      System.out.println("");
      System.out.println("✨ My Os   ☞ ʟɪɴᴜx ᴍᴀɴᴅʀɪᴠᴀ  ");
      System.out.println("✨ Support Channel   : ᴊᴏɪɴ "+channel);
      System.out.println("✨ Support group : ᴊᴏɪɴ "+group);
      System.out.println("");
      TimeUnit.SECONDS.sleep(5);
      System.out.println("°  Sudo:  Full access");
      System.out.println("°  Spam Protect:  True");
      System.out.println("°  Uptime: "+ date);
      System.out.println("");
      TimeUnit.SECONDS.sleep(7);
      System.out.println("sᴀʙ sᴀʜɪ ᴄʜᴀʟ ʀʜᴀ ʜᴀɪ sɪʀ😈 😈");
      TimeUnit.SECONDS.sleep(4);
      System.out.println("");
    }
    if(cmd.equals(".time"))
    {
      System.out.println("Fetching Time from your system");
      TimeUnit.SECONDS.sleep(1);
      System.out.print(".");
      TimeUnit.SECONDS.sleep(1);
      System.out.print(".");
      TimeUnit.SECONDS.sleep(1);
      System.out.println(".");
      System.out.println(date);
    }
    if(cmd.equals(".restart"))
    {
      System.out.println("Raganork is Restrating!!");
      System.out.print("Process");
      TimeUnit.SECONDS.sleep(1);
      System.out.print(".");
      TimeUnit.SECONDS.sleep(1);
      System.out.print(".");
      TimeUnit.SECONDS.sleep(1);
      System.out.println(".");
      System.out.print("Shutting down");
      System.out.print(".");
      TimeUnit.SECONDS.sleep(1);
      System.out.print(".");
      TimeUnit.SECONDS.sleep(1);
      System.out.println("Sucessfully Restarted Raganork");
    }
    if(!cmd.equals(".on")||cmd.equals(".time")||cmd.equals(".restart"))
    {
       System.out.println("Wrong Command ⚠️");
       TimeUnit.SECONDS.sleep(1);
       System.out.println("Enter one more time this time be Careful");
       cmd = sc.nextLine();
    if(cmd.equals(".on"))
    {
      System.out.println("");
      System.out.println("This is Raganork userbot !");
      System.out.println("");
      System.out.println("✨Servant of my master  : @Extremis_OP ");
      System.out.println("");
      System.out.println("✨My Os   ☞ ʟɪɴᴜx ᴍᴀɴᴅʀɪᴠᴀ  ");
      System.out.println("✨Support Channel   : ᴊᴏɪɴ "+channel);
      System.out.println("✨Support group : ᴊᴏɪɴ "+group);
      System.out.println("");
      System.out.println("°  Sudo:  Full access");
      System.out.println("°  Spam Protect:  True");
      System.out.println("°  Uptime: "+ date);
      System.out.println("");
      TimeUnit.SECONDS.sleep(1);
       System.out.println("sᴀʙ sᴀʜɪ ᴄʜᴀʟ ʀʜᴀ ʜᴀɪ sɪʀ😈 😈");
    }
    if(cmd.equals(".time"))
    {
      System.out.println("Fetching Time from your system");
      TimeUnit.SECONDS.sleep(1);
      System.out.print(".");
      TimeUnit.SECONDS.sleep(1);
      System.out.print(".");
      TimeUnit.SECONDS.sleep(1);
      System.out.println(".");
      System.out.println(date);
    }
    if(cmd.equals(".restart"))
    {
      System.out.println("Raganork is Restrating!!");
      System.out.print("Process");
      TimeUnit.SECONDS.sleep(1);
      System.out.print(".");
      TimeUnit.SECONDS.sleep(1);
      System.out.print(".");
      TimeUnit.SECONDS.sleep(1);
      System.out.println(".");
      System.out.print("Shutting down");
      System.out.print(".");
      TimeUnit.SECONDS.sleep(1);
      System.out.print(".");
      TimeUnit.SECONDS.sleep(1);
      System.out.println("Sucessfully Restarted Raganork");
    }
    else
    {
      System.out.println("I don't Beleive How can be a person so blind that can't  be able to see and write");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("please ");
      TimeUnit.SECONDS.sleep(1);
      System.out.print("don't ");
      TimeUnit.SECONDS.sleep(1);
      System.out.print("mind ");
      TimeUnit.SECONDS.sleep(1);
      System.out.print("I'm ");
      TimeUnit.SECONDS.sleep(1);
      System.out.print("an ");
      TimeUnit.SECONDS.sleep(1);
      System.out.print("AI ");
      TimeUnit.SECONDS.sleep(1);
      System.out.print("I ");
      TimeUnit.SECONDS.sleep(1);
      System.out.print("also ");
      TimeUnit.SECONDS.sleep(1);
      System.out.print("have ");
      TimeUnit.SECONDS.sleep(1);
      System.out.println("emotions/mood ");
      TimeUnit.SECONDS.sleep(1);
      System.out.println("So.......it happens Sometime😁 😁");
      TimeUnit.SECONDS.sleep(1);
    }
   }
  }
   System.out.println("So this was the AI Tutorial");
   System.out.println("Do you like that?");
   choice = sc.nextLine();
   if(choice.equals("yes")||choice!="ya"||choice!="hm"||choice!="hmm"||choice!="yo"||choice!="yup"||choice!="yos")
   {
      System.out.println("Thanks "+name+" 🤩");
      TimeUnit.SECONDS.sleep(1);
      System.out.println("But, say thanks to my Creator "+Developer+" for building this Amazing AI guide ❤️");
   }
   if(choice.equals("no"))
   {
      System.out.println("Ahh "+"you don't like that "+"and what do you mean by "+choice);
      TimeUnit.SECONDS.sleep(3);
      System.out.println("Leave, We will try to improve it 😃");
      TimeUnit.SECONDS.sleep(3);
      System.out.println("Thanks for the Feedback "+name);
   }
   else
   {
     System.out.println("I did'nt Understand what type of choice is "+choice+" I will ask my Creator for it and if its Worthy I will add it to my AI Dictionary");
     TimeUnit.SECONDS.sleep(2);
   }
   if(mood_fuck==true)
   {
       System.out.println("I remeber About your mood"+" I will ask that from my dev "+Developer);
   }
   if(mood_fuck==true&&choice!="yes"||choice!="ys"||choice!="hm"||choice!="hmm"||choice!="yo"||choice!="yup"||choice!="yos")
   {
      System.out.println("Ahh "+"you don't like that "+"and what do you mean by "+choice);
      TimeUnit.SECONDS.sleep(2);
      System.out.println("Leave, We will try to improve it 😃");
      TimeUnit.SECONDS.sleep(1);
      System.out.println("I remeber About your mood"+" I will ask that from my dev "+Developer);
      System.out.println("Thanks for the Feedback "+name);
   }
 }
}
 public static void main(String args[]) throws InterruptedException, IOException {
    Main object = new Main();
    JFrame f = new JFrame();
    f.add(object);
    f.setSize(350, 500);
    f.setVisible(true);
    object.start();
    //object.trial();
  }
}