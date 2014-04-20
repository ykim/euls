package gg.cloud9.euls.models.transformers;

import gg.cloud9.euls.annotations.ValueTransformer;
import gg.cloud9.euls.constants.Team;

import java.util.ArrayList;
import java.util.List;

public class TeamToEnum implements ValueTransformer<Integer, Team> {

    @Override
    public Team transform(Integer propValue) {
        return Team.fromId(propValue).orNull();
    }

    @Override
    public List<Team> transformArray(List<Integer> propArray) {
        if (propArray != null) {
            ArrayList<Team> propTransformArray = new ArrayList<Team>();

            for (Integer integer : propArray) {
                propTransformArray.add(Team.fromId(integer).orNull());
            }

            return propTransformArray;
        }
        return null;
    }
}
