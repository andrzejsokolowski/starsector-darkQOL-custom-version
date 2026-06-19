package darkqol.ids;

public class Ids {
    // Submarkets
    public static final String REVERSE_ENG_SUB = "Dark_ReversEngSub";
    public static final String PRIVATE_ARSENAL_SUB = "Dark_PrivateArsenalSub";

    // Industries (reverse engineering hub tiers)
    public static final String REVERSE_ENG_1_IND = "Dark_ReverseEngPhase1Ind";
    public static final String REVERSE_ENG_2_IND = "Dark_ReverseEngPhase2Ind";
    public static final String REVERSE_ENG_3_IND = "Dark_ReverseEngPhase3Ind";

    // Persistent sets of items the hub has reverse-engineered.
    // These drive what the integrated Private Arsenal is allowed to stock.
    public static final String PRODUCED_WEAPONS_MEMORY = "$Dark_RE_ProducedWeapons";
    public static final String PRODUCED_FIGHTERS_MEMORY = "$Dark_RE_ProducedFighters";
    public static final String PRODUCED_SHIPS_MEMORY = "$Dark_RE_ProducedShips";
}
