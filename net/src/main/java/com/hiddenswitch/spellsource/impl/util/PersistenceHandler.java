package com.hiddenswitch.spellsource.impl.util;

import io.vertx.core.Handler;
import net.demilich.metastone.game.cards.Attribute;
import net.demilich.metastone.game.events.GameEvent;
import net.demilich.metastone.game.events.GameEventType;

public class PersistenceHandler<T extends GameEvent> {
	private Handler<PersistenceContext<T>> handler;
	private String id;
	private GameEventType type;
	private Attribute attribute;

	public PersistenceHandler(Handler<PersistenceContext<T>> handler, String id, GameEventType type, Attribute attribute) {
		this.setHandler(handler);
		this.setId(id);
		this.setType(type);
		this.setAttribute(attribute);
	}

	public Handler<PersistenceContext<T>> getHandler() {
		return handler;
	}

	public void setHandler(Handler<PersistenceContext<T>> handler) {
		this.handler = handler;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public GameEventType getType() {
		return type;
	}

	public void setType(GameEventType type) {
		this.type = type;
	}

	public Attribute getAttribute() {
		return attribute;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}
}
