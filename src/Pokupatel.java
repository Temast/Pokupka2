import com.google.gson.Gson;

public class Pokupatel {
    String fio;
    String login;

    public Pokupatel(String fio, String login){
        this.fio = fio;
        this.login = login;
    }
    public static void main(String args[]){
        Pokupatel p = new Pokupatel("Петров Иван Кузьмич", "pik2010kip");
        Gson g = new Gson();
        String json = g.toJson(p);
        System.out.println(json);

        Tovar t = new Tovar("Машина", 2,200000.0,400000.0);
        String json2 = "{\"name\":\"Машина\",\"kolvo\":2,\"cena\":200000,\"stoim\":400000.0}";
        System.out.println(json2);
        Tovar t2 = g.fromJson(json2, Tovar.class);

        Pokupki po = new Pokupki("12.12.2018","Тиманская 1", "оплачено");
        String json3 = "{\"data\": \"12.12.2018\",\"adress\":\"Тиманская 1\", \"oplacheno\": \"oplacheno\"}";
        System.out.println(json3);
        Pokupki po2 = g.fromJson(json3, Pokupki.class);

        String json4 = "{\"fio\": \"Петров Иван Кузьмич\", \"login\": \"pik2010kip\"}";
        System.out.println(json4);
        Pokupatel p2 = g.fromJson(json4, Pokupatel.class);
    }
}
