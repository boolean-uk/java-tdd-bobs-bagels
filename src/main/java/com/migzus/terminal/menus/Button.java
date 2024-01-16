package com.migzus.terminal.menus;

public class Button {
    public boolean disabled = false;
    public final String displayName;

    private final Callable callable;

    public Button(String name, Callable callback) {
        displayName = name;
        callable = callback;
    }

    public void onSelect() {
        callable.call();
    }
}
