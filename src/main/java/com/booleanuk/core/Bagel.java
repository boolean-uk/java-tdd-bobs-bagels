package com.booleanuk.core;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Bagel {
    Plain("plain", 2.5),
    WithSesame("sesame", 3.),
    WithPoppy("poppy", 3.5);

    private final String type;
    private final double price;
}
