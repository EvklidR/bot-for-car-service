function checkAndAskData(context, parseTree) {
    if (!context.client) context.client = {};

    if (parseTree["_mystem.persn"]) context.client.fio = parseTree["_mystem.persn"];
    if (parseTree["_duckling.phone-number"]) context.client.phone = parseTree["_duckling.phone-number"];
    if (parseTree["_car"]) context.client.car = parseTree["_car"].text;

    var filled = 0;
    if (context.client.fio) filled++;
    if (context.client.phone) filled++;
    if (context.client.car) filled++;

    context.client.filled = filled >= 2;

    if (!context.client.filled) {
        var missing = [];
        if (!context.client.fio) missing.push("ФИО");
        if (!context.client.phone) missing.push("номер телефона");
        if (!context.client.car) missing.push("марку автомобиля");

        var question = "Пожалуйста, укажите недостающие данные: " + missing.join(", ") + ".";
        $reactions.answer(question);
    }
}
