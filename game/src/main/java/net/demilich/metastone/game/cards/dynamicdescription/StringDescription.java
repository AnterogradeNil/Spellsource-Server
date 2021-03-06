package net.demilich.metastone.game.cards.dynamicdescription;

import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.Player;
import net.demilich.metastone.game.cards.Card;

/**
 * Represents a simple string description.
 */
public class StringDescription extends DynamicDescription {

	public StringDescription(String s) {
		super(new DynamicDescriptionDesc());
		getDesc().put(DynamicDescriptionArg.STRING, s);
	}

	public StringDescription(DynamicDescriptionDesc desc) {
		super(desc);
	}

	@Override
	public String resolveFinalString(GameContext context, Player player, Card card) {
		return getDesc().getString(DynamicDescriptionArg.STRING);
	}
}
