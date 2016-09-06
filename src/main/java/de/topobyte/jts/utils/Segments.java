// Copyright 2015 Sebastian Kuerten
//
// This file is part of jts-medical-kit.
//
// jts-medical-kit is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// jts-medical-kit is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with jts-medical-kit. If not, see <http://www.gnu.org/licenses/>.

package de.topobyte.jts.utils;

import com.vividsolutions.jts.geom.LineSegment;

/**
 * @author Sebastian Kuerten (sebastian@topobyte.de)
 */
public class Segments
{

	public static boolean connected(LineSegment a, LineSegment b)
	{
		return (a.p0.equals(b.p0) || a.p0.equals(b.p1) || a.p1.equals(b.p0) || a.p1
				.equals(b.p1));
	}

}
