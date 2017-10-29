package com.jcloisterzone.game.capability;

import com.jcloisterzone.Player;
import com.jcloisterzone.ai.ForceSupportIfSupports;
import com.jcloisterzone.figure.Follower;
import com.jcloisterzone.figure.MeepleIdProvider;
import com.jcloisterzone.figure.SmallFollower;
import com.jcloisterzone.game.Capability;

import io.vavr.collection.List;
import io.vavr.collection.Stream;

@ForceSupportIfSupports(StandardGameCapability.class)
public class CarcassonneForTwoCapability extends Capability<Void> {

    @Override
    public List<Follower> createPlayerFollowers(Player player, MeepleIdProvider idProvider) {
        return Stream.range(0, 6)
            .map(i -> (Follower) new SmallFollower(idProvider.generateId(SmallFollower.class), player))
            .toList();
    }

}