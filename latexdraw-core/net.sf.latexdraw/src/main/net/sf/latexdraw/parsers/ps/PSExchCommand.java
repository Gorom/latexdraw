/*
 * This file is part of LaTeXDraw
 * Copyright (c) 2005-2017 Arnaud BLOUIN
 * LaTeXDraw is free software; you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 * LaTeXDraw is distributed without any warranty; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 */
package net.sf.latexdraw.parsers.ps;

import java.util.Deque;

/**
 * The Postscript exch command.
 */
public class PSExchCommand implements PSArithemticCommand {
	@Override
	public void execute(final Deque<Double> stack, final double x) throws InvalidFormatPSFunctionException {
		if(stack.size() < 2) throw new InvalidFormatPSFunctionException();

		final Double a = stack.pop();
		final Double b = stack.pop();

		stack.push(a);
		stack.push(b);
	}
}
