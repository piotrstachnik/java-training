package Chapterday.methods;

public class App
{
    public static void main( String[] args )
    {
        Sms sms = new Sms();
//        sms.text = "Wiadomość ING";
//        sms.send();
        sms.number = "000001000";
        System.out.println(sms.checkNumber());

        sms.text = "ąĄćĆęĘłŁńŃóÓśŚźŹżŻaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbXaaaaaaaaaaaaaaaaaaaaaa";
        System.out.println(sms.correctText());
        sms.send();
    }
}