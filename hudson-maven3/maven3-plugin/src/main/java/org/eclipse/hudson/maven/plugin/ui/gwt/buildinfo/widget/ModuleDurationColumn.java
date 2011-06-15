/**
 * The MIT License
 *
 * Copyright (c) 2010-2011 Sonatype, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.eclipse.hudson.maven.plugin.ui.gwt.buildinfo.widget;

import org.eclipse.hudson.maven.plugin.ui.gwt.buildinfo.ModuleFormatter;

import com.google.gwt.user.cellview.client.TextColumn;
import org.hudsonci.maven.model.state.MavenProjectDTO;

/**
 * Column to display the duration of a {@link MavenProjectDTO} build.
 * 
 * @author Jamie Whitehouse
 * @since 2.1.0
 */
public class ModuleDurationColumn
    extends TextColumn<MavenProjectDTO>
{
    public ModuleDurationColumn()
    {
        super();
        setHorizontalAlignment( ALIGN_RIGHT );
    }
    
    @Override
    public String getValue( MavenProjectDTO module )
    {
        return new ModuleFormatter( module ).duration();
    }
}
