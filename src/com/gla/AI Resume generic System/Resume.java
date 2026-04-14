package com.gla.AIResumeScreeningSystem;

class Resume<T extends JobRole> {
    T role;

    Resume(T role) {
        this.role = role;
    }
}

