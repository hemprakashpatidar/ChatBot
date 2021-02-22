package Bott;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.util.regex.*;


public class Bot extends JFrame {

	//Typing Area:
	private JTextField txtEnter = new JTextField();

	//Chat Area:
	private JTextArea txtChat = new JTextArea();

	public Bot() {
		//Frame Attributes:
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000, 600);
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(null);
		this.setTitle("Java AI");

		//txtEnter Attributes:
		txtEnter.setLocation(2, 540);
		txtEnter.setSize(590, 30);

		//txtEnter Action Event:
		txtEnter.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				String uText = txtEnter.getText();
				txtChat.append("You: " + uText + "\n");

//My Sol
int count=0;
/*
String Fee="[ a-zA-Z]*([fF]ee|cost)[ a-zA-Z]*BE[ a-zA-Z]*";
String Fee1="[ a-zA-Z]*(BE|[Ff]irst [Yy]ear)[ a-zA-Z]*([fF]ee|cost)[ a-zA-Z]*";
String Date="[ a-zA-Z]*([wW]hen|year)[ a-zA-Z]*(started|establish)[ a-zA-Z]*";
String Date1="[ a-zA-Z]*(started|establish)[ a-zA-Z]*[Yy]ear[ a-zA-Z]*";
String Rank="[ a-zA-Z]*([rR]ank|stand)[ a-zA-Z]*college[ a-zA-Z]*";
String Rank1="[ a-zA-Z]*college[ a-zA-Z]*([rR]ank|stand)[ a-zA-Z]*";
String CFest="[ a-zA-Z]*(cultural|annual) [fF]est[ a-zA-Z]*";
String CFest1="[ a-zA-Z]*[fF]est[ a-zA-Z]*college[ a-zA-Z]*";
String TFest="[ a-zA-Z]*[tT]ech[ a-zA-Z]*[fF]est[ a-zA-Z]*";
String TFest1=TFest;

String Loc="[ a-zA-Z]*([Aa]ddress|[Ll]ocation)[ a-zA-Z]*college[ a-zA-Z]*";
String Loc1="[ a-zA-Z]*college[ a-zA-Z]*([Aa]ddress|[Ll]ocation)[ a-zA-Z]*";
String Bran="[ a-zA-Z]*[Bb]ranch[ a-zA-Z]*sliding[ a-zA-Z]*";
String Bran1="[ a-zA-Z]*sliding[ a-zA-Z]*[Bb]ranch[ a-zA-Z]*";
String Exa="[ a-zA-Z]*[Ee]xam[ a-zA-Z]*pattern[ a-zA-Z]*";
String Exa1="[ a-zA-Z]*pattern[ a-zA-Z]*[Ee]xam[ a-zA-Z]*";
String HW="[ a-zA-Z]*[hH]ostel[ a-zA-Z]*facility[ a-zA-Z]*water system[ a-zA-Z]*";
String HW1="[ a-zA-Z]*[hH]ostel[ a-zA-Z]*facility[ a-zA-Z]*water system[ a-zA-Z]*";
String HM="[ a-zA-Z]*[hH]ostel[ a-zA-Z]*[Mm]ess[ a-zA-Z]*";
String HM1="[ a-zA-Z]*[Mm]ess[ a-zA-Z]*[hH]ostel[ a-zA-Z]*";

String Hos="[ a-zA-Z]*[hH]ostel[ a-zA-Z]*facility[ a-zA-Z]*";
String Hos1="[ a-zA-Z]*facility[ a-zA-Z]*[hH]ostel[ a-zA-Z]*";
String feed="[ a-zA-Z]*[fF]eedback[ a-zA-Z]*[mM]ess[ a-zA-Z]*";
String feed1="[ a-zA-Z]*[mM]ess[ a-zA-Z]*[fF]eedback[ a-zA-Z]*";
String cant="[ a-zA-Z]*[cC]anteen[ a-zA-Z]*facility[ a-zA-Z]*";
String cant1="[ a-zA-Z]*facility[ a-zA-Z]*[cC]anteen[ a-zA-Z]*";
String time="[ a-zA-Z]*[Tt]im[ a-zA-Z]*college[ a-zA-Z]*";
String time1="[ a-zA-Z]*college[ a-zA-Z]*[Tt]im[ a-zA-Z]*";
String mode="[ a-zA-Z]*[Ff]ee[ a-zA-Z]*(payment|submission)[ a-zA-Z]*";
String mode1="[ a-zA-Z]*(payment|submission)[ a-zA-Z]*[Ff]ee[ a-zA-Z]*";

String Q[]={Fee, Fee1, Date, Date1, Rank, Rank1, CFest, CFest1, TFest, TFest1, Loc, Loc1, Bran, Bran1,Exa,Exa1,HW,HW1,Hos,Hos1,HM,HM1,feed,feed1,cant,cant1,time,time1,mode,mode1};

String AFee="It will cost aprox 80,000";
//String AFee1="It will cost aprox 80,000";
String ADate="It started in 1996";
String ARank="IET-DAVV Ranked 2nd in MP";
String ACFest="Yes, Aakshank is the biggest annual cultural fest of central India  and is one of the huge and highly acknowledged cultural fest. \n It is mostly held in February.";
String ATFest="Yes, Invento is the annual technical Fest of IET-DAVV which is held in August or September. This festival is the largest technical fest of central india with a huge footfall \n of students from different colleges of central India";
String ALoc="Khandwa Road, DAVV Takshila Parisar, Indore, MP 452020";
String ABran="Yes, It is possible";
String AExa="Exam is based on CBCS system. There are 3 mid-Sem exams conducted in every semester which comprises of 20 marks each. Best of Two mid-sem marks are taken \n and added to end semester exam comprising of 60 Marks resulting in 100 marks total.";
String AHos="Yes, Hostel facility is available";
String AHW="Water facility is available 24x7 in IET-DAVV hostels";
String AHM="Mess facility is available in IET-DAVV hostels";
String Afeed="The reviews of Hostel mess are quite positive";
String Acant="There is canteen facility available in IET-DAVV with decent feedback rate";
String Atime="It is generally from 10 A.M. to 4 P.M. but it varies for students studying in different years as per their time table";
String Amode="Fee is paid semester-vise, online patment via netbanking or by various other online payment modes is possible";


String Ans[]={AFee, ADate, ARank,ACFest,ATFest,ALoc,ABran,AExa,AHW,AHos,AHM,Afeed,Acant,Atime,Amode};
*/
feed f=new feed();
String q[]=f.mt();
String a[]=f.mt1();
for(int i=0;q[i]!=null;i++){
Pattern p = Pattern.compile(q[i]);
Matcher m = p.matcher(uText);
if(m.matches())
{
count++;
botSay(a[i/2]);
break;
//break;
}
}				if(count==0)
				if(uText.contains("hi")){
					botSay("Hello there!");
				}
				else if(uText.contains("how are you")){
					int decider = (int) (Math.random()*2+1);
					if(decider == 1){
						botSay("I'm doing well, thanks");
					}
					else if(decider == 2){
						botSay("Not too bad");
					}
				}
				else{if(count==0)
					{int decider = (int) (Math.random()*3+1);
					if(decider == 1){
						botSay("I didn't get that");
					}
					else if(decider == 2){
						botSay("Please rephrase that");
					}
					else if(decider == 3){
						botSay("???");
					}}
				}
				txtEnter.setText("");
			}
		});

		//txtChat Attributes:
		txtChat.setLocation(15, 5);
		txtChat.setSize(960, 510);
		txtChat.setEditable(false);

		//Add Items To Frame:
		this.add(txtEnter);
		this.add(txtChat);
	}

	public void botSay(String s){
		txtChat.append("AI: " + s + "\n");
	}

	public static void main(String[] args){
		new Bot();
	}

}