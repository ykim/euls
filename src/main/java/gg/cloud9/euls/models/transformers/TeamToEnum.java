package gg.cloud9.euls.models.transformers;

import gg.cloud9.euls.annotations.ValueTransformer;
import gg.cloud9.euls.constants.Team;

public class TeamToEnum implements ValueTransformer<Integer, Team> {

    @Override
    public Team transform(Integer propValue) {
        return Team.fromId(propValue).orNull();
    }
}
