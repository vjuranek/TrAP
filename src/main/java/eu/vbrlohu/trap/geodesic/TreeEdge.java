/** This file is part of TrAP, Tree Averaging Program, which computes medians and means of phylogenetic trees.
    Copyright (C) 2013 Miroslav Bacak, Vojtech Juranek

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>. */

package eu.vbrlohu.trap.geodesic;

public class TreeEdge {

	private double length;

	public TreeEdge(double lenght) {
	    this.length = lenght;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
}
