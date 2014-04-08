package gg.cloud9.euls.models.transformers;

import gg.cloud9.euls.annotations.ValueTransformer;
import gg.cloud9.euls.constants.Team;

public class TeamToEnum implements ValueTransformer<Integer, Team> {

    @Override
    public Team transform(Integer propValue) {
        return Team.fromId(propValue).orNull();
    }

    @Override
    public Team[] transformArray(Integer[] propArray) {
        if (propArray != null) {
            Team[] propTransformArray = new Team[propArray.length];

            for (int i = 0; i < propArray.length; i++) {
                propTransformArray[i] = Team.fromId(propArray[i]).orNull();
            }

            return propTransformArray;
        }
        return null;
    }
}
