function saveUserData(context, parseTree) {
    if (!context.client) context.client = {};

    if (parseTree["_mystem.persn"]) {
        context.client.fio = parseTree["_mystem.persn"];
    }

    if (parseTree["_duckling.phone-number"]) {
        context.client.phone = parseTree["_duckling.phone-number"];
    }
    
    if (parseTree["_car"]) {
        context.client.car = parseTree["_car"];
    }

    return context.client;
}