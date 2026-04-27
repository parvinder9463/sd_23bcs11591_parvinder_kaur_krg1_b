using namespace std;

interface Messaging {
    void textMsg(String text);
}

interface Postable {
    void Post(String post);
}

interface Commentable {
    void Comment(String comment);
}


// WhatsApp → only messaging
class WhatsApp implements Messaging {
    public void textMsg(String text) {
        System.out.println("WhatsApp Message: " + text);
    }
}


// Instagram → messaging + post + comment
class Instagram implements Messaging, Postable, Commentable {
    public void textMsg(String text) {
        System.out.println("Instagram Message: " + text);
    }

    public void Post(String post) {
        System.out.println("Instagram Post Uploaded: " + post);
    }

    public void Comment(String comment) {
        System.out.println("Instagram Comment: " + comment);
    }
}


// Facebook → messaging + post + comment
class Facebook implements Messaging, Postable, Commentable {
    public void textMsg(String text) {
        System.out.println("Facebook Message: " + text);
    }

    public void Post(String post) {
        System.out.println("Facebook Post Uploaded: " + post);
    }

    public void Comment(String comment) {
        System.out.println("Facebook Comment: " + comment);
    }
}


// Main Class
class Main {
    public static void main(String[] args) {

        Messaging obj1 = new WhatsApp();
        obj1.textMsg("Hello Parvinder");

        Instagram obj2 = new Instagram();
        obj2.Post("My new photo");

        Facebook obj3 = new Facebook();
        obj3.Comment("Nice Post");
    }
}