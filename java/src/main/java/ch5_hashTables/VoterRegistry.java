package ch5_hashTables;

import java.util.HashMap;

public class VoterRegistry {

    private final HashMap<String, Boolean> voters = new HashMap<>();

    public String checkVoter(String voterName) {
        if (voterName == null || voterName.trim().isEmpty()) {
            throw new IllegalArgumentException("voterName cannot be null or empty");
        } else if (voters.containsKey(voterName)) {
            return voterName + " already voted!!!";
        } else {
            voters.put(voterName, true);
            return voterName + " can vote.";
        }
    }

    public static void main (String[] args) {
        VoterRegistry registry = new VoterRegistry();
        System.out.println(registry.checkVoter("Tom"));
        System.out.println(registry.checkVoter("Mark"));
        System.out.println(registry.checkVoter("Tom"));
    }
}
