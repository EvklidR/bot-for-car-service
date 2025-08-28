function normPhone(value) {
    if (!value) return value;

    value = value.replace(/[\s\-()]/g, "");

    if (value.startsWith("+7")) {
        value = "7" + value.slice(2);
    } else if (value.startsWith("8")) {
        value = "7" + value.slice(1);
    }

    return value;
}