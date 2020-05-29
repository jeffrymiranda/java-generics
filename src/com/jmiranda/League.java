package com.jmiranda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> {

    private final String name;
    private final List<T> teamList;

    public League(final String name) {
        this.name = name;
        this.teamList = new ArrayList<>();
    }

    public void addTeam(T team) {
        if (!this.teamList.contains(team)) {
            this.teamList.add(team);
        }
    }

    public void printTeams() {
        Collections.sort(this.teamList);
        this.teamList.forEach(this::printTeamName);
    }

    private void printTeamName(T team) {
        System.out.println(team.getName() + ": " + team.ranking());
    }
}
