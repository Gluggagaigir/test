package is.ru.hugb;

import static spark.Spark.*;

public class Testt {

	public static void main(String[] args) {
		port(getHerokuPort());
		get("/", (req, res) -> {
			return "No route specified.";
		});
		get("/tst", (req, res) -> tst());
	}

	static int getHerokuPort() {
		ProcessBuilder psb = new ProcessBuilder();
		if (psb.environment().get("PORT") != null) {
			return Integer.parseInt(psb.environment().get("PORT"));
		}
		return 4567;
	}

	public static int tst() {
		return 1;
	}
}