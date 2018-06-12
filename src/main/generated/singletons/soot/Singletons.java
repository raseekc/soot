package soot;

/*-
 * #%L
 * Soot - a J*va Optimization Framework
 * %%
 * Copyright (C) 2003 Ondrej Lhotak
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */

/** A class to group together all the global variables in Soot. */
@javax.annotation.Generated(value = "Saxonica v3.0", date = "2018-04-16T19:15:42.948+02:00", comments = "from singletons.xml")
public class Singletons {

    public final class Global {
        private Global() {}
    }

    protected Global g = new Global();

    private soot.PhaseOptions instance_soot_PhaseOptions;
    public soot.PhaseOptions soot_PhaseOptions() {
        if (instance_soot_PhaseOptions == null) {
	       	synchronized (this) {
		        if (instance_soot_PhaseOptions == null)
	        		instance_soot_PhaseOptions = new soot.PhaseOptions(g);
	       	}
       	}
        return instance_soot_PhaseOptions;
    }
    protected void release_soot_PhaseOptions() {
    	instance_soot_PhaseOptions = null;
    }

    private soot.jimple.toolkits.callgraph.VirtualCalls instance_soot_jimple_toolkits_callgraph_VirtualCalls;
    public soot.jimple.toolkits.callgraph.VirtualCalls soot_jimple_toolkits_callgraph_VirtualCalls() {
        if (instance_soot_jimple_toolkits_callgraph_VirtualCalls == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_callgraph_VirtualCalls == null)
	        		instance_soot_jimple_toolkits_callgraph_VirtualCalls = new soot.jimple.toolkits.callgraph.VirtualCalls(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_callgraph_VirtualCalls;
    }
    protected void release_soot_jimple_toolkits_callgraph_VirtualCalls() {
    	instance_soot_jimple_toolkits_callgraph_VirtualCalls = null;
    }

    private soot.jimple.spark.fieldrw.FieldTagger instance_soot_jimple_spark_fieldrw_FieldTagger;
    public soot.jimple.spark.fieldrw.FieldTagger soot_jimple_spark_fieldrw_FieldTagger() {
        if (instance_soot_jimple_spark_fieldrw_FieldTagger == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_spark_fieldrw_FieldTagger == null)
	        		instance_soot_jimple_spark_fieldrw_FieldTagger = new soot.jimple.spark.fieldrw.FieldTagger(g);
	       	}
       	}
        return instance_soot_jimple_spark_fieldrw_FieldTagger;
    }
    protected void release_soot_jimple_spark_fieldrw_FieldTagger() {
    	instance_soot_jimple_spark_fieldrw_FieldTagger = null;
    }

    private soot.util.SharedBitSetCache instance_soot_util_SharedBitSetCache;
    public soot.util.SharedBitSetCache soot_util_SharedBitSetCache() {
        if (instance_soot_util_SharedBitSetCache == null) {
	       	synchronized (this) {
		        if (instance_soot_util_SharedBitSetCache == null)
	        		instance_soot_util_SharedBitSetCache = new soot.util.SharedBitSetCache(g);
	       	}
       	}
        return instance_soot_util_SharedBitSetCache;
    }
    protected void release_soot_util_SharedBitSetCache() {
    	instance_soot_util_SharedBitSetCache = null;
    }

    private soot.options.Options instance_soot_options_Options;
    public soot.options.Options soot_options_Options() {
        if (instance_soot_options_Options == null) {
	       	synchronized (this) {
		        if (instance_soot_options_Options == null)
	        		instance_soot_options_Options = new soot.options.Options(g);
	       	}
       	}
        return instance_soot_options_Options;
    }
    protected void release_soot_options_Options() {
    	instance_soot_options_Options = null;
    }

    private soot.jimple.toolkits.callgraph.CHATransformer instance_soot_jimple_toolkits_callgraph_CHATransformer;
    public soot.jimple.toolkits.callgraph.CHATransformer soot_jimple_toolkits_callgraph_CHATransformer() {
        if (instance_soot_jimple_toolkits_callgraph_CHATransformer == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_callgraph_CHATransformer == null)
	        		instance_soot_jimple_toolkits_callgraph_CHATransformer = new soot.jimple.toolkits.callgraph.CHATransformer(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_callgraph_CHATransformer;
    }
    protected void release_soot_jimple_toolkits_callgraph_CHATransformer() {
    	instance_soot_jimple_toolkits_callgraph_CHATransformer = null;
    }

    private soot.toolkits.graph.SlowPseudoTopologicalOrderer instance_soot_toolkits_graph_SlowPseudoTopologicalOrderer;
    public soot.toolkits.graph.SlowPseudoTopologicalOrderer soot_toolkits_graph_SlowPseudoTopologicalOrderer() {
        if (instance_soot_toolkits_graph_SlowPseudoTopologicalOrderer == null) {
	       	synchronized (this) {
		        if (instance_soot_toolkits_graph_SlowPseudoTopologicalOrderer == null)
	        		instance_soot_toolkits_graph_SlowPseudoTopologicalOrderer = new soot.toolkits.graph.SlowPseudoTopologicalOrderer(g);
	       	}
       	}
        return instance_soot_toolkits_graph_SlowPseudoTopologicalOrderer;
    }
    protected void release_soot_toolkits_graph_SlowPseudoTopologicalOrderer() {
    	instance_soot_toolkits_graph_SlowPseudoTopologicalOrderer = null;
    }

    private soot.jimple.toolkits.invoke.SynchronizerManager instance_soot_jimple_toolkits_invoke_SynchronizerManager;
    public soot.jimple.toolkits.invoke.SynchronizerManager soot_jimple_toolkits_invoke_SynchronizerManager() {
        if (instance_soot_jimple_toolkits_invoke_SynchronizerManager == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_invoke_SynchronizerManager == null)
	        		instance_soot_jimple_toolkits_invoke_SynchronizerManager = new soot.jimple.toolkits.invoke.SynchronizerManager(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_invoke_SynchronizerManager;
    }
    protected void release_soot_jimple_toolkits_invoke_SynchronizerManager() {
    	instance_soot_jimple_toolkits_invoke_SynchronizerManager = null;
    }

    private soot.jimple.toolkits.typing.integer.ClassHierarchy instance_soot_jimple_toolkits_typing_integer_ClassHierarchy;
    public soot.jimple.toolkits.typing.integer.ClassHierarchy soot_jimple_toolkits_typing_integer_ClassHierarchy() {
        if (instance_soot_jimple_toolkits_typing_integer_ClassHierarchy == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_typing_integer_ClassHierarchy == null)
	        		instance_soot_jimple_toolkits_typing_integer_ClassHierarchy = new soot.jimple.toolkits.typing.integer.ClassHierarchy(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_typing_integer_ClassHierarchy;
    }
    protected void release_soot_jimple_toolkits_typing_integer_ClassHierarchy() {
    	instance_soot_jimple_toolkits_typing_integer_ClassHierarchy = null;
    }

    private soot.Main instance_soot_Main;
    public soot.Main soot_Main() {
        if (instance_soot_Main == null) {
	       	synchronized (this) {
		        if (instance_soot_Main == null)
	        		instance_soot_Main = new soot.Main(g);
	       	}
       	}
        return instance_soot_Main;
    }
    protected void release_soot_Main() {
    	instance_soot_Main = null;
    }

    private soot.tagkit.TagManager instance_soot_tagkit_TagManager;
    public soot.tagkit.TagManager soot_tagkit_TagManager() {
        if (instance_soot_tagkit_TagManager == null) {
	       	synchronized (this) {
		        if (instance_soot_tagkit_TagManager == null)
	        		instance_soot_tagkit_TagManager = new soot.tagkit.TagManager(g);
	       	}
       	}
        return instance_soot_tagkit_TagManager;
    }
    protected void release_soot_tagkit_TagManager() {
    	instance_soot_tagkit_TagManager = null;
    }

    private soot.jimple.toolkits.pointer.representations.Environment instance_soot_jimple_toolkits_pointer_representations_Environment;
    public soot.jimple.toolkits.pointer.representations.Environment soot_jimple_toolkits_pointer_representations_Environment() {
        if (instance_soot_jimple_toolkits_pointer_representations_Environment == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_pointer_representations_Environment == null)
	        		instance_soot_jimple_toolkits_pointer_representations_Environment = new soot.jimple.toolkits.pointer.representations.Environment(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_pointer_representations_Environment;
    }
    protected void release_soot_jimple_toolkits_pointer_representations_Environment() {
    	instance_soot_jimple_toolkits_pointer_representations_Environment = null;
    }

    private soot.jimple.toolkits.pointer.representations.TypeConstants instance_soot_jimple_toolkits_pointer_representations_TypeConstants;
    public soot.jimple.toolkits.pointer.representations.TypeConstants soot_jimple_toolkits_pointer_representations_TypeConstants() {
        if (instance_soot_jimple_toolkits_pointer_representations_TypeConstants == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_pointer_representations_TypeConstants == null)
	        		instance_soot_jimple_toolkits_pointer_representations_TypeConstants = new soot.jimple.toolkits.pointer.representations.TypeConstants(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_pointer_representations_TypeConstants;
    }
    protected void release_soot_jimple_toolkits_pointer_representations_TypeConstants() {
    	instance_soot_jimple_toolkits_pointer_representations_TypeConstants = null;
    }

    private soot.coffi.Util instance_soot_coffi_Util;
    public soot.coffi.Util soot_coffi_Util() {
        if (instance_soot_coffi_Util == null) {
	       	synchronized (this) {
		        if (instance_soot_coffi_Util == null)
	        		instance_soot_coffi_Util = new soot.coffi.Util(g);
	       	}
       	}
        return instance_soot_coffi_Util;
    }
    protected void release_soot_coffi_Util() {
    	instance_soot_coffi_Util = null;
    }

    private soot.SourceLocator instance_soot_SourceLocator;
    public soot.SourceLocator soot_SourceLocator() {
        if (instance_soot_SourceLocator == null) {
	       	synchronized (this) {
		        if (instance_soot_SourceLocator == null)
	        		instance_soot_SourceLocator = new soot.SourceLocator(g);
	       	}
       	}
        return instance_soot_SourceLocator;
    }
    protected void release_soot_SourceLocator() {
    	instance_soot_SourceLocator = null;
    }

    private soot.coffi.CONSTANT_Utf8_collector instance_soot_coffi_CONSTANT_Utf8_collector;
    public soot.coffi.CONSTANT_Utf8_collector soot_coffi_CONSTANT_Utf8_collector() {
        if (instance_soot_coffi_CONSTANT_Utf8_collector == null) {
	       	synchronized (this) {
		        if (instance_soot_coffi_CONSTANT_Utf8_collector == null)
	        		instance_soot_coffi_CONSTANT_Utf8_collector = new soot.coffi.CONSTANT_Utf8_collector(g);
	       	}
       	}
        return instance_soot_coffi_CONSTANT_Utf8_collector;
    }
    protected void release_soot_coffi_CONSTANT_Utf8_collector() {
    	instance_soot_coffi_CONSTANT_Utf8_collector = null;
    }

    private soot.dava.toolkits.base.finders.AbruptEdgeFinder instance_soot_dava_toolkits_base_finders_AbruptEdgeFinder;
    public soot.dava.toolkits.base.finders.AbruptEdgeFinder soot_dava_toolkits_base_finders_AbruptEdgeFinder() {
        if (instance_soot_dava_toolkits_base_finders_AbruptEdgeFinder == null) {
	       	synchronized (this) {
		        if (instance_soot_dava_toolkits_base_finders_AbruptEdgeFinder == null)
	        		instance_soot_dava_toolkits_base_finders_AbruptEdgeFinder = new soot.dava.toolkits.base.finders.AbruptEdgeFinder(g);
	       	}
       	}
        return instance_soot_dava_toolkits_base_finders_AbruptEdgeFinder;
    }
    protected void release_soot_dava_toolkits_base_finders_AbruptEdgeFinder() {
    	instance_soot_dava_toolkits_base_finders_AbruptEdgeFinder = null;
    }

    private soot.jimple.toolkits.base.Aggregator instance_soot_jimple_toolkits_base_Aggregator;
    public soot.jimple.toolkits.base.Aggregator soot_jimple_toolkits_base_Aggregator() {
        if (instance_soot_jimple_toolkits_base_Aggregator == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_base_Aggregator == null)
	        		instance_soot_jimple_toolkits_base_Aggregator = new soot.jimple.toolkits.base.Aggregator(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_base_Aggregator;
    }
    protected void release_soot_jimple_toolkits_base_Aggregator() {
    	instance_soot_jimple_toolkits_base_Aggregator = null;
    }

    private soot.jimple.toolkits.annotation.arraycheck.ArrayBoundsChecker instance_soot_jimple_toolkits_annotation_arraycheck_ArrayBoundsChecker;
    public soot.jimple.toolkits.annotation.arraycheck.ArrayBoundsChecker soot_jimple_toolkits_annotation_arraycheck_ArrayBoundsChecker() {
        if (instance_soot_jimple_toolkits_annotation_arraycheck_ArrayBoundsChecker == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_annotation_arraycheck_ArrayBoundsChecker == null)
	        		instance_soot_jimple_toolkits_annotation_arraycheck_ArrayBoundsChecker = new soot.jimple.toolkits.annotation.arraycheck.ArrayBoundsChecker(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_annotation_arraycheck_ArrayBoundsChecker;
    }
    protected void release_soot_jimple_toolkits_annotation_arraycheck_ArrayBoundsChecker() {
    	instance_soot_jimple_toolkits_annotation_arraycheck_ArrayBoundsChecker = null;
    }

    private soot.jimple.spark.pag.ArrayElement instance_soot_jimple_spark_pag_ArrayElement;
    public soot.jimple.spark.pag.ArrayElement soot_jimple_spark_pag_ArrayElement() {
        if (instance_soot_jimple_spark_pag_ArrayElement == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_spark_pag_ArrayElement == null)
	        		instance_soot_jimple_spark_pag_ArrayElement = new soot.jimple.spark.pag.ArrayElement(g);
	       	}
       	}
        return instance_soot_jimple_spark_pag_ArrayElement;
    }
    protected void release_soot_jimple_spark_pag_ArrayElement() {
    	instance_soot_jimple_spark_pag_ArrayElement = null;
    }

    private soot.jimple.toolkits.annotation.tags.ArrayNullTagAggregator instance_soot_jimple_toolkits_annotation_tags_ArrayNullTagAggregator;
    public soot.jimple.toolkits.annotation.tags.ArrayNullTagAggregator soot_jimple_toolkits_annotation_tags_ArrayNullTagAggregator() {
        if (instance_soot_jimple_toolkits_annotation_tags_ArrayNullTagAggregator == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_annotation_tags_ArrayNullTagAggregator == null)
	        		instance_soot_jimple_toolkits_annotation_tags_ArrayNullTagAggregator = new soot.jimple.toolkits.annotation.tags.ArrayNullTagAggregator(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_annotation_tags_ArrayNullTagAggregator;
    }
    protected void release_soot_jimple_toolkits_annotation_tags_ArrayNullTagAggregator() {
    	instance_soot_jimple_toolkits_annotation_tags_ArrayNullTagAggregator = null;
    }

    private soot.dava.toolkits.base.AST.ASTWalker instance_soot_dava_toolkits_base_AST_ASTWalker;
    public soot.dava.toolkits.base.AST.ASTWalker soot_dava_toolkits_base_AST_ASTWalker() {
        if (instance_soot_dava_toolkits_base_AST_ASTWalker == null) {
	       	synchronized (this) {
		        if (instance_soot_dava_toolkits_base_AST_ASTWalker == null)
	        		instance_soot_dava_toolkits_base_AST_ASTWalker = new soot.dava.toolkits.base.AST.ASTWalker(g);
	       	}
       	}
        return instance_soot_dava_toolkits_base_AST_ASTWalker;
    }
    protected void release_soot_dava_toolkits_base_AST_ASTWalker() {
    	instance_soot_dava_toolkits_base_AST_ASTWalker = null;
    }

    private soot.baf.Baf instance_soot_baf_Baf;
    public soot.baf.Baf soot_baf_Baf() {
        if (instance_soot_baf_Baf == null) {
	       	synchronized (this) {
		        if (instance_soot_baf_Baf == null)
	        		instance_soot_baf_Baf = new soot.baf.Baf(g);
	       	}
       	}
        return instance_soot_baf_Baf;
    }
    protected void release_soot_baf_Baf() {
    	instance_soot_baf_Baf = null;
    }

    private soot.BooleanType instance_soot_BooleanType;
    public soot.BooleanType soot_BooleanType() {
        if (instance_soot_BooleanType == null) {
	       	synchronized (this) {
		        if (instance_soot_BooleanType == null)
	        		instance_soot_BooleanType = new soot.BooleanType(g);
	       	}
       	}
        return instance_soot_BooleanType;
    }
    protected void release_soot_BooleanType() {
    	instance_soot_BooleanType = null;
    }

    private soot.jimple.toolkits.scalar.pre.BusyCodeMotion instance_soot_jimple_toolkits_scalar_pre_BusyCodeMotion;
    public soot.jimple.toolkits.scalar.pre.BusyCodeMotion soot_jimple_toolkits_scalar_pre_BusyCodeMotion() {
        if (instance_soot_jimple_toolkits_scalar_pre_BusyCodeMotion == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_scalar_pre_BusyCodeMotion == null)
	        		instance_soot_jimple_toolkits_scalar_pre_BusyCodeMotion = new soot.jimple.toolkits.scalar.pre.BusyCodeMotion(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_scalar_pre_BusyCodeMotion;
    }
    protected void release_soot_jimple_toolkits_scalar_pre_BusyCodeMotion() {
    	instance_soot_jimple_toolkits_scalar_pre_BusyCodeMotion = null;
    }

    private soot.ByteType instance_soot_ByteType;
    public soot.ByteType soot_ByteType() {
        if (instance_soot_ByteType == null) {
	       	synchronized (this) {
		        if (instance_soot_ByteType == null)
	        		instance_soot_ByteType = new soot.ByteType(g);
	       	}
       	}
        return instance_soot_ByteType;
    }
    protected void release_soot_ByteType() {
    	instance_soot_ByteType = null;
    }

    private soot.jimple.toolkits.pointer.CastCheckEliminatorDumper instance_soot_jimple_toolkits_pointer_CastCheckEliminatorDumper;
    public soot.jimple.toolkits.pointer.CastCheckEliminatorDumper soot_jimple_toolkits_pointer_CastCheckEliminatorDumper() {
        if (instance_soot_jimple_toolkits_pointer_CastCheckEliminatorDumper == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_pointer_CastCheckEliminatorDumper == null)
	        		instance_soot_jimple_toolkits_pointer_CastCheckEliminatorDumper = new soot.jimple.toolkits.pointer.CastCheckEliminatorDumper(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_pointer_CastCheckEliminatorDumper;
    }
    protected void release_soot_jimple_toolkits_pointer_CastCheckEliminatorDumper() {
    	instance_soot_jimple_toolkits_pointer_CastCheckEliminatorDumper = null;
    }

    private soot.CharType instance_soot_CharType;
    public soot.CharType soot_CharType() {
        if (instance_soot_CharType == null) {
	       	synchronized (this) {
		        if (instance_soot_CharType == null)
	        		instance_soot_CharType = new soot.CharType(g);
	       	}
       	}
        return instance_soot_CharType;
    }
    protected void release_soot_CharType() {
    	instance_soot_CharType = null;
    }

    private soot.jimple.toolkits.annotation.arraycheck.ClassFieldAnalysis instance_soot_jimple_toolkits_annotation_arraycheck_ClassFieldAnalysis;
    public soot.jimple.toolkits.annotation.arraycheck.ClassFieldAnalysis soot_jimple_toolkits_annotation_arraycheck_ClassFieldAnalysis() {
        if (instance_soot_jimple_toolkits_annotation_arraycheck_ClassFieldAnalysis == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_annotation_arraycheck_ClassFieldAnalysis == null)
	        		instance_soot_jimple_toolkits_annotation_arraycheck_ClassFieldAnalysis = new soot.jimple.toolkits.annotation.arraycheck.ClassFieldAnalysis(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_annotation_arraycheck_ClassFieldAnalysis;
    }
    protected void release_soot_jimple_toolkits_annotation_arraycheck_ClassFieldAnalysis() {
    	instance_soot_jimple_toolkits_annotation_arraycheck_ClassFieldAnalysis = null;
    }

    private soot.jimple.toolkits.scalar.CommonSubexpressionEliminator instance_soot_jimple_toolkits_scalar_CommonSubexpressionEliminator;
    public soot.jimple.toolkits.scalar.CommonSubexpressionEliminator soot_jimple_toolkits_scalar_CommonSubexpressionEliminator() {
        if (instance_soot_jimple_toolkits_scalar_CommonSubexpressionEliminator == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_scalar_CommonSubexpressionEliminator == null)
	        		instance_soot_jimple_toolkits_scalar_CommonSubexpressionEliminator = new soot.jimple.toolkits.scalar.CommonSubexpressionEliminator(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_scalar_CommonSubexpressionEliminator;
    }
    protected void release_soot_jimple_toolkits_scalar_CommonSubexpressionEliminator() {
    	instance_soot_jimple_toolkits_scalar_CommonSubexpressionEliminator = null;
    }

    private soot.jimple.toolkits.scalar.ConditionalBranchFolder instance_soot_jimple_toolkits_scalar_ConditionalBranchFolder;
    public soot.jimple.toolkits.scalar.ConditionalBranchFolder soot_jimple_toolkits_scalar_ConditionalBranchFolder() {
        if (instance_soot_jimple_toolkits_scalar_ConditionalBranchFolder == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_scalar_ConditionalBranchFolder == null)
	        		instance_soot_jimple_toolkits_scalar_ConditionalBranchFolder = new soot.jimple.toolkits.scalar.ConditionalBranchFolder(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_scalar_ConditionalBranchFolder;
    }
    protected void release_soot_jimple_toolkits_scalar_ConditionalBranchFolder() {
    	instance_soot_jimple_toolkits_scalar_ConditionalBranchFolder = null;
    }

    private soot.jimple.toolkits.scalar.ConstantPropagatorAndFolder instance_soot_jimple_toolkits_scalar_ConstantPropagatorAndFolder;
    public soot.jimple.toolkits.scalar.ConstantPropagatorAndFolder soot_jimple_toolkits_scalar_ConstantPropagatorAndFolder() {
        if (instance_soot_jimple_toolkits_scalar_ConstantPropagatorAndFolder == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_scalar_ConstantPropagatorAndFolder == null)
	        		instance_soot_jimple_toolkits_scalar_ConstantPropagatorAndFolder = new soot.jimple.toolkits.scalar.ConstantPropagatorAndFolder(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_scalar_ConstantPropagatorAndFolder;
    }
    protected void release_soot_jimple_toolkits_scalar_ConstantPropagatorAndFolder() {
    	instance_soot_jimple_toolkits_scalar_ConstantPropagatorAndFolder = null;
    }

    private soot.grimp.toolkits.base.ConstructorFolder instance_soot_grimp_toolkits_base_ConstructorFolder;
    public soot.grimp.toolkits.base.ConstructorFolder soot_grimp_toolkits_base_ConstructorFolder() {
        if (instance_soot_grimp_toolkits_base_ConstructorFolder == null) {
	       	synchronized (this) {
		        if (instance_soot_grimp_toolkits_base_ConstructorFolder == null)
	        		instance_soot_grimp_toolkits_base_ConstructorFolder = new soot.grimp.toolkits.base.ConstructorFolder(g);
	       	}
       	}
        return instance_soot_grimp_toolkits_base_ConstructorFolder;
    }
    protected void release_soot_grimp_toolkits_base_ConstructorFolder() {
    	instance_soot_grimp_toolkits_base_ConstructorFolder = null;
    }

    private soot.jimple.toolkits.scalar.CopyPropagator instance_soot_jimple_toolkits_scalar_CopyPropagator;
    public soot.jimple.toolkits.scalar.CopyPropagator soot_jimple_toolkits_scalar_CopyPropagator() {
        if (instance_soot_jimple_toolkits_scalar_CopyPropagator == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_scalar_CopyPropagator == null)
	        		instance_soot_jimple_toolkits_scalar_CopyPropagator = new soot.jimple.toolkits.scalar.CopyPropagator(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_scalar_CopyPropagator;
    }
    protected void release_soot_jimple_toolkits_scalar_CopyPropagator() {
    	instance_soot_jimple_toolkits_scalar_CopyPropagator = null;
    }

    private soot.jimple.toolkits.graph.CriticalEdgeRemover instance_soot_jimple_toolkits_graph_CriticalEdgeRemover;
    public soot.jimple.toolkits.graph.CriticalEdgeRemover soot_jimple_toolkits_graph_CriticalEdgeRemover() {
        if (instance_soot_jimple_toolkits_graph_CriticalEdgeRemover == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_graph_CriticalEdgeRemover == null)
	        		instance_soot_jimple_toolkits_graph_CriticalEdgeRemover = new soot.jimple.toolkits.graph.CriticalEdgeRemover(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_graph_CriticalEdgeRemover;
    }
    protected void release_soot_jimple_toolkits_graph_CriticalEdgeRemover() {
    	instance_soot_jimple_toolkits_graph_CriticalEdgeRemover = null;
    }

    private soot.dava.toolkits.base.finders.CycleFinder instance_soot_dava_toolkits_base_finders_CycleFinder;
    public soot.dava.toolkits.base.finders.CycleFinder soot_dava_toolkits_base_finders_CycleFinder() {
        if (instance_soot_dava_toolkits_base_finders_CycleFinder == null) {
	       	synchronized (this) {
		        if (instance_soot_dava_toolkits_base_finders_CycleFinder == null)
	        		instance_soot_dava_toolkits_base_finders_CycleFinder = new soot.dava.toolkits.base.finders.CycleFinder(g);
	       	}
       	}
        return instance_soot_dava_toolkits_base_finders_CycleFinder;
    }
    protected void release_soot_dava_toolkits_base_finders_CycleFinder() {
    	instance_soot_dava_toolkits_base_finders_CycleFinder = null;
    }

    private soot.dava.Dava instance_soot_dava_Dava;
    public soot.dava.Dava soot_dava_Dava() {
        if (instance_soot_dava_Dava == null) {
	       	synchronized (this) {
		        if (instance_soot_dava_Dava == null)
	        		instance_soot_dava_Dava = new soot.dava.Dava(g);
	       	}
       	}
        return instance_soot_dava_Dava;
    }
    protected void release_soot_dava_Dava() {
    	instance_soot_dava_Dava = null;
    }

    private soot.dava.DavaPrinter instance_soot_dava_DavaPrinter;
    public soot.dava.DavaPrinter soot_dava_DavaPrinter() {
        if (instance_soot_dava_DavaPrinter == null) {
	       	synchronized (this) {
		        if (instance_soot_dava_DavaPrinter == null)
	        		instance_soot_dava_DavaPrinter = new soot.dava.DavaPrinter(g);
	       	}
       	}
        return instance_soot_dava_DavaPrinter;
    }
    protected void release_soot_dava_DavaPrinter() {
    	instance_soot_dava_DavaPrinter = null;
    }

    private soot.xml.XMLPrinter instance_soot_xml_XMLPrinter;
    public soot.xml.XMLPrinter soot_xml_XMLPrinter() {
        if (instance_soot_xml_XMLPrinter == null) {
	       	synchronized (this) {
		        if (instance_soot_xml_XMLPrinter == null)
	        		instance_soot_xml_XMLPrinter = new soot.xml.XMLPrinter(g);
	       	}
       	}
        return instance_soot_xml_XMLPrinter;
    }
    protected void release_soot_xml_XMLPrinter() {
    	instance_soot_xml_XMLPrinter = null;
    }

    private soot.Printer instance_soot_Printer;
    public soot.Printer soot_Printer() {
        if (instance_soot_Printer == null) {
	       	synchronized (this) {
		        if (instance_soot_Printer == null)
	        		instance_soot_Printer = new soot.Printer(g);
	       	}
       	}
        return instance_soot_Printer;
    }
    protected void release_soot_Printer() {
    	instance_soot_Printer = null;
    }

    private soot.jimple.toolkits.scalar.DeadAssignmentEliminator instance_soot_jimple_toolkits_scalar_DeadAssignmentEliminator;
    public soot.jimple.toolkits.scalar.DeadAssignmentEliminator soot_jimple_toolkits_scalar_DeadAssignmentEliminator() {
        if (instance_soot_jimple_toolkits_scalar_DeadAssignmentEliminator == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_scalar_DeadAssignmentEliminator == null)
	        		instance_soot_jimple_toolkits_scalar_DeadAssignmentEliminator = new soot.jimple.toolkits.scalar.DeadAssignmentEliminator(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_scalar_DeadAssignmentEliminator;
    }
    protected void release_soot_jimple_toolkits_scalar_DeadAssignmentEliminator() {
    	instance_soot_jimple_toolkits_scalar_DeadAssignmentEliminator = null;
    }

    private soot.jimple.toolkits.pointer.DependenceTagAggregator instance_soot_jimple_toolkits_pointer_DependenceTagAggregator;
    public soot.jimple.toolkits.pointer.DependenceTagAggregator soot_jimple_toolkits_pointer_DependenceTagAggregator() {
        if (instance_soot_jimple_toolkits_pointer_DependenceTagAggregator == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_pointer_DependenceTagAggregator == null)
	        		instance_soot_jimple_toolkits_pointer_DependenceTagAggregator = new soot.jimple.toolkits.pointer.DependenceTagAggregator(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_pointer_DependenceTagAggregator;
    }
    protected void release_soot_jimple_toolkits_pointer_DependenceTagAggregator() {
    	instance_soot_jimple_toolkits_pointer_DependenceTagAggregator = null;
    }

    private soot.coffi.Double2ndHalfType instance_soot_coffi_Double2ndHalfType;
    public soot.coffi.Double2ndHalfType soot_coffi_Double2ndHalfType() {
        if (instance_soot_coffi_Double2ndHalfType == null) {
	       	synchronized (this) {
		        if (instance_soot_coffi_Double2ndHalfType == null)
	        		instance_soot_coffi_Double2ndHalfType = new soot.coffi.Double2ndHalfType(g);
	       	}
       	}
        return instance_soot_coffi_Double2ndHalfType;
    }
    protected void release_soot_coffi_Double2ndHalfType() {
    	instance_soot_coffi_Double2ndHalfType = null;
    }

    private soot.DoubleType instance_soot_DoubleType;
    public soot.DoubleType soot_DoubleType() {
        if (instance_soot_DoubleType == null) {
	       	synchronized (this) {
		        if (instance_soot_DoubleType == null)
	        		instance_soot_DoubleType = new soot.DoubleType(g);
	       	}
       	}
        return instance_soot_DoubleType;
    }
    protected void release_soot_DoubleType() {
    	instance_soot_DoubleType = null;
    }

    private soot.baf.DoubleWordType instance_soot_baf_DoubleWordType;
    public soot.baf.DoubleWordType soot_baf_DoubleWordType() {
        if (instance_soot_baf_DoubleWordType == null) {
	       	synchronized (this) {
		        if (instance_soot_baf_DoubleWordType == null)
	        		instance_soot_baf_DoubleWordType = new soot.baf.DoubleWordType(g);
	       	}
       	}
        return instance_soot_baf_DoubleWordType;
    }
    protected void release_soot_baf_DoubleWordType() {
    	instance_soot_baf_DoubleWordType = null;
    }

    private soot.jimple.toolkits.pointer.DumbPointerAnalysis instance_soot_jimple_toolkits_pointer_DumbPointerAnalysis;
    public soot.jimple.toolkits.pointer.DumbPointerAnalysis soot_jimple_toolkits_pointer_DumbPointerAnalysis() {
        if (instance_soot_jimple_toolkits_pointer_DumbPointerAnalysis == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_pointer_DumbPointerAnalysis == null)
	        		instance_soot_jimple_toolkits_pointer_DumbPointerAnalysis = new soot.jimple.toolkits.pointer.DumbPointerAnalysis(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_pointer_DumbPointerAnalysis;
    }
    protected void release_soot_jimple_toolkits_pointer_DumbPointerAnalysis() {
    	instance_soot_jimple_toolkits_pointer_DumbPointerAnalysis = null;
    }

    private soot.jimple.spark.sets.EmptyPointsToSet instance_soot_jimple_spark_sets_EmptyPointsToSet;
    public soot.jimple.spark.sets.EmptyPointsToSet soot_jimple_spark_sets_EmptyPointsToSet() {
        if (instance_soot_jimple_spark_sets_EmptyPointsToSet == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_spark_sets_EmptyPointsToSet == null)
	        		instance_soot_jimple_spark_sets_EmptyPointsToSet = new soot.jimple.spark.sets.EmptyPointsToSet(g);
	       	}
       	}
        return instance_soot_jimple_spark_sets_EmptyPointsToSet;
    }
    protected void release_soot_jimple_spark_sets_EmptyPointsToSet() {
    	instance_soot_jimple_spark_sets_EmptyPointsToSet = null;
    }

    private soot.ErroneousType instance_soot_ErroneousType;
    public soot.ErroneousType soot_ErroneousType() {
        if (instance_soot_ErroneousType == null) {
	       	synchronized (this) {
		        if (instance_soot_ErroneousType == null)
	        		instance_soot_ErroneousType = new soot.ErroneousType(g);
	       	}
       	}
        return instance_soot_ErroneousType;
    }
    protected void release_soot_ErroneousType() {
    	instance_soot_ErroneousType = null;
    }

    private soot.dava.toolkits.base.finders.ExceptionFinder instance_soot_dava_toolkits_base_finders_ExceptionFinder;
    public soot.dava.toolkits.base.finders.ExceptionFinder soot_dava_toolkits_base_finders_ExceptionFinder() {
        if (instance_soot_dava_toolkits_base_finders_ExceptionFinder == null) {
	       	synchronized (this) {
		        if (instance_soot_dava_toolkits_base_finders_ExceptionFinder == null)
	        		instance_soot_dava_toolkits_base_finders_ExceptionFinder = new soot.dava.toolkits.base.finders.ExceptionFinder(g);
	       	}
       	}
        return instance_soot_dava_toolkits_base_finders_ExceptionFinder;
    }
    protected void release_soot_dava_toolkits_base_finders_ExceptionFinder() {
    	instance_soot_dava_toolkits_base_finders_ExceptionFinder = null;
    }

    private soot.jimple.toolkits.pointer.FieldRWTagger instance_soot_jimple_toolkits_pointer_FieldRWTagger;
    public soot.jimple.toolkits.pointer.FieldRWTagger soot_jimple_toolkits_pointer_FieldRWTagger() {
        if (instance_soot_jimple_toolkits_pointer_FieldRWTagger == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_pointer_FieldRWTagger == null)
	        		instance_soot_jimple_toolkits_pointer_FieldRWTagger = new soot.jimple.toolkits.pointer.FieldRWTagger(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_pointer_FieldRWTagger;
    }
    protected void release_soot_jimple_toolkits_pointer_FieldRWTagger() {
    	instance_soot_jimple_toolkits_pointer_FieldRWTagger = null;
    }

    private soot.FloatType instance_soot_FloatType;
    public soot.FloatType soot_FloatType() {
        if (instance_soot_FloatType == null) {
	       	synchronized (this) {
		        if (instance_soot_FloatType == null)
	        		instance_soot_FloatType = new soot.FloatType(g);
	       	}
       	}
        return instance_soot_FloatType;
    }
    protected void release_soot_FloatType() {
    	instance_soot_FloatType = null;
    }

    private soot.jimple.toolkits.pointer.FullObjectSet instance_soot_jimple_toolkits_pointer_FullObjectSet;
    public soot.jimple.toolkits.pointer.FullObjectSet soot_jimple_toolkits_pointer_FullObjectSet() {
        if (instance_soot_jimple_toolkits_pointer_FullObjectSet == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_pointer_FullObjectSet == null)
	        		instance_soot_jimple_toolkits_pointer_FullObjectSet = new soot.jimple.toolkits.pointer.FullObjectSet(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_pointer_FullObjectSet;
    }
    protected void release_soot_jimple_toolkits_pointer_FullObjectSet() {
    	instance_soot_jimple_toolkits_pointer_FullObjectSet = null;
    }

    private soot.grimp.Grimp instance_soot_grimp_Grimp;
    public soot.grimp.Grimp soot_grimp_Grimp() {
        if (instance_soot_grimp_Grimp == null) {
	       	synchronized (this) {
		        if (instance_soot_grimp_Grimp == null)
	        		instance_soot_grimp_Grimp = new soot.grimp.Grimp(g);
	       	}
       	}
        return instance_soot_grimp_Grimp;
    }
    protected void release_soot_grimp_Grimp() {
    	instance_soot_grimp_Grimp = null;
    }

    private soot.dava.toolkits.base.finders.IfFinder instance_soot_dava_toolkits_base_finders_IfFinder;
    public soot.dava.toolkits.base.finders.IfFinder soot_dava_toolkits_base_finders_IfFinder() {
        if (instance_soot_dava_toolkits_base_finders_IfFinder == null) {
	       	synchronized (this) {
		        if (instance_soot_dava_toolkits_base_finders_IfFinder == null)
	        		instance_soot_dava_toolkits_base_finders_IfFinder = new soot.dava.toolkits.base.finders.IfFinder(g);
	       	}
       	}
        return instance_soot_dava_toolkits_base_finders_IfFinder;
    }
    protected void release_soot_dava_toolkits_base_finders_IfFinder() {
    	instance_soot_dava_toolkits_base_finders_IfFinder = null;
    }

    private soot.IntType instance_soot_IntType;
    public soot.IntType soot_IntType() {
        if (instance_soot_IntType == null) {
	       	synchronized (this) {
		        if (instance_soot_IntType == null)
	        		instance_soot_IntType = new soot.IntType(g);
	       	}
       	}
        return instance_soot_IntType;
    }
    protected void release_soot_IntType() {
    	instance_soot_IntType = null;
    }

    private soot.jimple.Jimple instance_soot_jimple_Jimple;
    public soot.jimple.Jimple soot_jimple_Jimple() {
        if (instance_soot_jimple_Jimple == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_Jimple == null)
	        		instance_soot_jimple_Jimple = new soot.jimple.Jimple(g);
	       	}
       	}
        return instance_soot_jimple_Jimple;
    }
    protected void release_soot_jimple_Jimple() {
    	instance_soot_jimple_Jimple = null;
    }

    private soot.dava.toolkits.base.finders.LabeledBlockFinder instance_soot_dava_toolkits_base_finders_LabeledBlockFinder;
    public soot.dava.toolkits.base.finders.LabeledBlockFinder soot_dava_toolkits_base_finders_LabeledBlockFinder() {
        if (instance_soot_dava_toolkits_base_finders_LabeledBlockFinder == null) {
	       	synchronized (this) {
		        if (instance_soot_dava_toolkits_base_finders_LabeledBlockFinder == null)
	        		instance_soot_dava_toolkits_base_finders_LabeledBlockFinder = new soot.dava.toolkits.base.finders.LabeledBlockFinder(g);
	       	}
       	}
        return instance_soot_dava_toolkits_base_finders_LabeledBlockFinder;
    }
    protected void release_soot_dava_toolkits_base_finders_LabeledBlockFinder() {
    	instance_soot_dava_toolkits_base_finders_LabeledBlockFinder = null;
    }

    private soot.jimple.toolkits.scalar.pre.LazyCodeMotion instance_soot_jimple_toolkits_scalar_pre_LazyCodeMotion;
    public soot.jimple.toolkits.scalar.pre.LazyCodeMotion soot_jimple_toolkits_scalar_pre_LazyCodeMotion() {
        if (instance_soot_jimple_toolkits_scalar_pre_LazyCodeMotion == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_scalar_pre_LazyCodeMotion == null)
	        		instance_soot_jimple_toolkits_scalar_pre_LazyCodeMotion = new soot.jimple.toolkits.scalar.pre.LazyCodeMotion(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_scalar_pre_LazyCodeMotion;
    }
    protected void release_soot_jimple_toolkits_scalar_pre_LazyCodeMotion() {
    	instance_soot_jimple_toolkits_scalar_pre_LazyCodeMotion = null;
    }

    private soot.tagkit.LineNumberTagAggregator instance_soot_tagkit_LineNumberTagAggregator;
    public soot.tagkit.LineNumberTagAggregator soot_tagkit_LineNumberTagAggregator() {
        if (instance_soot_tagkit_LineNumberTagAggregator == null) {
	       	synchronized (this) {
		        if (instance_soot_tagkit_LineNumberTagAggregator == null)
	        		instance_soot_tagkit_LineNumberTagAggregator = new soot.tagkit.LineNumberTagAggregator(g);
	       	}
       	}
        return instance_soot_tagkit_LineNumberTagAggregator;
    }
    protected void release_soot_tagkit_LineNumberTagAggregator() {
    	instance_soot_tagkit_LineNumberTagAggregator = null;
    }

    private soot.tagkit.InnerClassTagAggregator instance_soot_tagkit_InnerClassTagAggregator;
    public soot.tagkit.InnerClassTagAggregator soot_tagkit_InnerClassTagAggregator() {
        if (instance_soot_tagkit_InnerClassTagAggregator == null) {
	       	synchronized (this) {
		        if (instance_soot_tagkit_InnerClassTagAggregator == null)
	        		instance_soot_tagkit_InnerClassTagAggregator = new soot.tagkit.InnerClassTagAggregator(g);
	       	}
       	}
        return instance_soot_tagkit_InnerClassTagAggregator;
    }
    protected void release_soot_tagkit_InnerClassTagAggregator() {
    	instance_soot_tagkit_InnerClassTagAggregator = null;
    }

    private soot.jimple.toolkits.annotation.LineNumberAdder instance_soot_jimple_toolkits_annotation_LineNumberAdder;
    public soot.jimple.toolkits.annotation.LineNumberAdder soot_jimple_toolkits_annotation_LineNumberAdder() {
        if (instance_soot_jimple_toolkits_annotation_LineNumberAdder == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_annotation_LineNumberAdder == null)
	        		instance_soot_jimple_toolkits_annotation_LineNumberAdder = new soot.jimple.toolkits.annotation.LineNumberAdder(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_annotation_LineNumberAdder;
    }
    protected void release_soot_jimple_toolkits_annotation_LineNumberAdder() {
    	instance_soot_jimple_toolkits_annotation_LineNumberAdder = null;
    }

    private soot.baf.toolkits.base.LoadStoreOptimizer instance_soot_baf_toolkits_base_LoadStoreOptimizer;
    public soot.baf.toolkits.base.LoadStoreOptimizer soot_baf_toolkits_base_LoadStoreOptimizer() {
        if (instance_soot_baf_toolkits_base_LoadStoreOptimizer == null) {
	       	synchronized (this) {
		        if (instance_soot_baf_toolkits_base_LoadStoreOptimizer == null)
	        		instance_soot_baf_toolkits_base_LoadStoreOptimizer = new soot.baf.toolkits.base.LoadStoreOptimizer(g);
	       	}
       	}
        return instance_soot_baf_toolkits_base_LoadStoreOptimizer;
    }
    protected void release_soot_baf_toolkits_base_LoadStoreOptimizer() {
    	instance_soot_baf_toolkits_base_LoadStoreOptimizer = null;
    }

    private soot.baf.toolkits.base.StoreChainOptimizer instance_soot_baf_toolkits_base_StoreChainOptimizer;
    public soot.baf.toolkits.base.StoreChainOptimizer soot_baf_toolkits_base_StoreChainOptimizer() {
        if (instance_soot_baf_toolkits_base_StoreChainOptimizer == null) {
	       	synchronized (this) {
		        if (instance_soot_baf_toolkits_base_StoreChainOptimizer == null)
	        		instance_soot_baf_toolkits_base_StoreChainOptimizer = new soot.baf.toolkits.base.StoreChainOptimizer(g);
	       	}
       	}
        return instance_soot_baf_toolkits_base_StoreChainOptimizer;
    }
    protected void release_soot_baf_toolkits_base_StoreChainOptimizer() {
    	instance_soot_baf_toolkits_base_StoreChainOptimizer = null;
    }

    private soot.jimple.toolkits.scalar.LocalNameStandardizer instance_soot_jimple_toolkits_scalar_LocalNameStandardizer;
    public soot.jimple.toolkits.scalar.LocalNameStandardizer soot_jimple_toolkits_scalar_LocalNameStandardizer() {
        if (instance_soot_jimple_toolkits_scalar_LocalNameStandardizer == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_scalar_LocalNameStandardizer == null)
	        		instance_soot_jimple_toolkits_scalar_LocalNameStandardizer = new soot.jimple.toolkits.scalar.LocalNameStandardizer(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_scalar_LocalNameStandardizer;
    }
    protected void release_soot_jimple_toolkits_scalar_LocalNameStandardizer() {
    	instance_soot_jimple_toolkits_scalar_LocalNameStandardizer = null;
    }

    private soot.toolkits.scalar.LocalPacker instance_soot_toolkits_scalar_LocalPacker;
    public soot.toolkits.scalar.LocalPacker soot_toolkits_scalar_LocalPacker() {
        if (instance_soot_toolkits_scalar_LocalPacker == null) {
	       	synchronized (this) {
		        if (instance_soot_toolkits_scalar_LocalPacker == null)
	        		instance_soot_toolkits_scalar_LocalPacker = new soot.toolkits.scalar.LocalPacker(g);
	       	}
       	}
        return instance_soot_toolkits_scalar_LocalPacker;
    }
    protected void release_soot_toolkits_scalar_LocalPacker() {
    	instance_soot_toolkits_scalar_LocalPacker = null;
    }

    private soot.toolkits.scalar.LocalSplitter instance_soot_toolkits_scalar_LocalSplitter;
    public soot.toolkits.scalar.LocalSplitter soot_toolkits_scalar_LocalSplitter() {
        if (instance_soot_toolkits_scalar_LocalSplitter == null) {
	       	synchronized (this) {
		        if (instance_soot_toolkits_scalar_LocalSplitter == null)
	        		instance_soot_toolkits_scalar_LocalSplitter = new soot.toolkits.scalar.LocalSplitter(g);
	       	}
       	}
        return instance_soot_toolkits_scalar_LocalSplitter;
    }
    protected void release_soot_toolkits_scalar_LocalSplitter() {
    	instance_soot_toolkits_scalar_LocalSplitter = null;
    }

    private soot.coffi.Long2ndHalfType instance_soot_coffi_Long2ndHalfType;
    public soot.coffi.Long2ndHalfType soot_coffi_Long2ndHalfType() {
        if (instance_soot_coffi_Long2ndHalfType == null) {
	       	synchronized (this) {
		        if (instance_soot_coffi_Long2ndHalfType == null)
	        		instance_soot_coffi_Long2ndHalfType = new soot.coffi.Long2ndHalfType(g);
	       	}
       	}
        return instance_soot_coffi_Long2ndHalfType;
    }
    protected void release_soot_coffi_Long2ndHalfType() {
    	instance_soot_coffi_Long2ndHalfType = null;
    }

    private soot.LongType instance_soot_LongType;
    public soot.LongType soot_LongType() {
        if (instance_soot_LongType == null) {
	       	synchronized (this) {
		        if (instance_soot_LongType == null)
	        		instance_soot_LongType = new soot.LongType(g);
	       	}
       	}
        return instance_soot_LongType;
    }
    protected void release_soot_LongType() {
    	instance_soot_LongType = null;
    }

    private soot.dava.toolkits.base.misc.MonitorConverter instance_soot_dava_toolkits_base_misc_MonitorConverter;
    public soot.dava.toolkits.base.misc.MonitorConverter soot_dava_toolkits_base_misc_MonitorConverter() {
        if (instance_soot_dava_toolkits_base_misc_MonitorConverter == null) {
	       	synchronized (this) {
		        if (instance_soot_dava_toolkits_base_misc_MonitorConverter == null)
	        		instance_soot_dava_toolkits_base_misc_MonitorConverter = new soot.dava.toolkits.base.misc.MonitorConverter(g);
	       	}
       	}
        return instance_soot_dava_toolkits_base_misc_MonitorConverter;
    }
    protected void release_soot_dava_toolkits_base_misc_MonitorConverter() {
    	instance_soot_dava_toolkits_base_misc_MonitorConverter = null;
    }

    private soot.jimple.toolkits.scalar.NopEliminator instance_soot_jimple_toolkits_scalar_NopEliminator;
    public soot.jimple.toolkits.scalar.NopEliminator soot_jimple_toolkits_scalar_NopEliminator() {
        if (instance_soot_jimple_toolkits_scalar_NopEliminator == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_scalar_NopEliminator == null)
	        		instance_soot_jimple_toolkits_scalar_NopEliminator = new soot.jimple.toolkits.scalar.NopEliminator(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_scalar_NopEliminator;
    }
    protected void release_soot_jimple_toolkits_scalar_NopEliminator() {
    	instance_soot_jimple_toolkits_scalar_NopEliminator = null;
    }

    private soot.jimple.NullConstant instance_soot_jimple_NullConstant;
    public soot.jimple.NullConstant soot_jimple_NullConstant() {
        if (instance_soot_jimple_NullConstant == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_NullConstant == null)
	        		instance_soot_jimple_NullConstant = new soot.jimple.NullConstant(g);
	       	}
       	}
        return instance_soot_jimple_NullConstant;
    }
    protected void release_soot_jimple_NullConstant() {
    	instance_soot_jimple_NullConstant = null;
    }

    private soot.jimple.toolkits.annotation.nullcheck.NullPointerChecker instance_soot_jimple_toolkits_annotation_nullcheck_NullPointerChecker;
    public soot.jimple.toolkits.annotation.nullcheck.NullPointerChecker soot_jimple_toolkits_annotation_nullcheck_NullPointerChecker() {
        if (instance_soot_jimple_toolkits_annotation_nullcheck_NullPointerChecker == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_annotation_nullcheck_NullPointerChecker == null)
	        		instance_soot_jimple_toolkits_annotation_nullcheck_NullPointerChecker = new soot.jimple.toolkits.annotation.nullcheck.NullPointerChecker(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_annotation_nullcheck_NullPointerChecker;
    }
    protected void release_soot_jimple_toolkits_annotation_nullcheck_NullPointerChecker() {
    	instance_soot_jimple_toolkits_annotation_nullcheck_NullPointerChecker = null;
    }

    private soot.NullType instance_soot_NullType;
    public soot.NullType soot_NullType() {
        if (instance_soot_NullType == null) {
	       	synchronized (this) {
		        if (instance_soot_NullType == null)
	        		instance_soot_NullType = new soot.NullType(g);
	       	}
       	}
        return instance_soot_NullType;
    }
    protected void release_soot_NullType() {
    	instance_soot_NullType = null;
    }

    private soot.dava.toolkits.base.misc.PackageNamer instance_soot_dava_toolkits_base_misc_PackageNamer;
    public soot.dava.toolkits.base.misc.PackageNamer soot_dava_toolkits_base_misc_PackageNamer() {
        if (instance_soot_dava_toolkits_base_misc_PackageNamer == null) {
	       	synchronized (this) {
		        if (instance_soot_dava_toolkits_base_misc_PackageNamer == null)
	        		instance_soot_dava_toolkits_base_misc_PackageNamer = new soot.dava.toolkits.base.misc.PackageNamer(g);
	       	}
       	}
        return instance_soot_dava_toolkits_base_misc_PackageNamer;
    }
    protected void release_soot_dava_toolkits_base_misc_PackageNamer() {
    	instance_soot_dava_toolkits_base_misc_PackageNamer = null;
    }

    private soot.PackManager instance_soot_PackManager;
    public soot.PackManager soot_PackManager() {
        if (instance_soot_PackManager == null) {
	       	synchronized (this) {
		        if (instance_soot_PackManager == null)
	        		instance_soot_PackManager = new soot.PackManager(g);
	       	}
       	}
        return instance_soot_PackManager;
    }
    protected void release_soot_PackManager() {
    	instance_soot_PackManager = null;
    }

    private soot.baf.toolkits.base.PeepholeOptimizer instance_soot_baf_toolkits_base_PeepholeOptimizer;
    public soot.baf.toolkits.base.PeepholeOptimizer soot_baf_toolkits_base_PeepholeOptimizer() {
        if (instance_soot_baf_toolkits_base_PeepholeOptimizer == null) {
	       	synchronized (this) {
		        if (instance_soot_baf_toolkits_base_PeepholeOptimizer == null)
	        		instance_soot_baf_toolkits_base_PeepholeOptimizer = new soot.baf.toolkits.base.PeepholeOptimizer(g);
	       	}
       	}
        return instance_soot_baf_toolkits_base_PeepholeOptimizer;
    }
    protected void release_soot_baf_toolkits_base_PeepholeOptimizer() {
    	instance_soot_baf_toolkits_base_PeepholeOptimizer = null;
    }

    private soot.jimple.toolkits.annotation.profiling.ProfilingGenerator instance_soot_jimple_toolkits_annotation_profiling_ProfilingGenerator;
    public soot.jimple.toolkits.annotation.profiling.ProfilingGenerator soot_jimple_toolkits_annotation_profiling_ProfilingGenerator() {
        if (instance_soot_jimple_toolkits_annotation_profiling_ProfilingGenerator == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_annotation_profiling_ProfilingGenerator == null)
	        		instance_soot_jimple_toolkits_annotation_profiling_ProfilingGenerator = new soot.jimple.toolkits.annotation.profiling.ProfilingGenerator(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_annotation_profiling_ProfilingGenerator;
    }
    protected void release_soot_jimple_toolkits_annotation_profiling_ProfilingGenerator() {
    	instance_soot_jimple_toolkits_annotation_profiling_ProfilingGenerator = null;
    }

    private soot.jimple.toolkits.annotation.arraycheck.RectangularArrayFinder instance_soot_jimple_toolkits_annotation_arraycheck_RectangularArrayFinder;
    public soot.jimple.toolkits.annotation.arraycheck.RectangularArrayFinder soot_jimple_toolkits_annotation_arraycheck_RectangularArrayFinder() {
        if (instance_soot_jimple_toolkits_annotation_arraycheck_RectangularArrayFinder == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_annotation_arraycheck_RectangularArrayFinder == null)
	        		instance_soot_jimple_toolkits_annotation_arraycheck_RectangularArrayFinder = new soot.jimple.toolkits.annotation.arraycheck.RectangularArrayFinder(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_annotation_arraycheck_RectangularArrayFinder;
    }
    protected void release_soot_jimple_toolkits_annotation_arraycheck_RectangularArrayFinder() {
    	instance_soot_jimple_toolkits_annotation_arraycheck_RectangularArrayFinder = null;
    }

    private soot.RefType instance_soot_RefType;
    public soot.RefType soot_RefType() {
        if (instance_soot_RefType == null) {
	       	synchronized (this) {
		        if (instance_soot_RefType == null)
	        		instance_soot_RefType = new soot.RefType(g);
	       	}
       	}
        return instance_soot_RefType;
    }
    protected void release_soot_RefType() {
    	instance_soot_RefType = null;
    }

    private soot.Scene instance_soot_Scene;
    public soot.Scene soot_Scene() {
        if (instance_soot_Scene == null) {
	       	synchronized (this) {
		        if (instance_soot_Scene == null)
	        		instance_soot_Scene = new soot.Scene(g);
	       	}
       	}
        return instance_soot_Scene;
    }
    protected void release_soot_Scene() {
    	instance_soot_Scene = null;
    }

    private soot.dava.toolkits.base.finders.SequenceFinder instance_soot_dava_toolkits_base_finders_SequenceFinder;
    public soot.dava.toolkits.base.finders.SequenceFinder soot_dava_toolkits_base_finders_SequenceFinder() {
        if (instance_soot_dava_toolkits_base_finders_SequenceFinder == null) {
	       	synchronized (this) {
		        if (instance_soot_dava_toolkits_base_finders_SequenceFinder == null)
	        		instance_soot_dava_toolkits_base_finders_SequenceFinder = new soot.dava.toolkits.base.finders.SequenceFinder(g);
	       	}
       	}
        return instance_soot_dava_toolkits_base_finders_SequenceFinder;
    }
    protected void release_soot_dava_toolkits_base_finders_SequenceFinder() {
    	instance_soot_dava_toolkits_base_finders_SequenceFinder = null;
    }

    private soot.shimple.Shimple instance_soot_shimple_Shimple;
    public soot.shimple.Shimple soot_shimple_Shimple() {
        if (instance_soot_shimple_Shimple == null) {
	       	synchronized (this) {
		        if (instance_soot_shimple_Shimple == null)
	        		instance_soot_shimple_Shimple = new soot.shimple.Shimple(g);
	       	}
       	}
        return instance_soot_shimple_Shimple;
    }
    protected void release_soot_shimple_Shimple() {
    	instance_soot_shimple_Shimple = null;
    }

    private soot.shimple.ShimpleTransformer instance_soot_shimple_ShimpleTransformer;
    public soot.shimple.ShimpleTransformer soot_shimple_ShimpleTransformer() {
        if (instance_soot_shimple_ShimpleTransformer == null) {
	       	synchronized (this) {
		        if (instance_soot_shimple_ShimpleTransformer == null)
	        		instance_soot_shimple_ShimpleTransformer = new soot.shimple.ShimpleTransformer(g);
	       	}
       	}
        return instance_soot_shimple_ShimpleTransformer;
    }
    protected void release_soot_shimple_ShimpleTransformer() {
    	instance_soot_shimple_ShimpleTransformer = null;
    }

    private soot.shimple.toolkits.scalar.SConstantPropagatorAndFolder instance_soot_shimple_toolkits_scalar_SConstantPropagatorAndFolder;
    public soot.shimple.toolkits.scalar.SConstantPropagatorAndFolder soot_shimple_toolkits_scalar_SConstantPropagatorAndFolder() {
        if (instance_soot_shimple_toolkits_scalar_SConstantPropagatorAndFolder == null) {
	       	synchronized (this) {
		        if (instance_soot_shimple_toolkits_scalar_SConstantPropagatorAndFolder == null)
	        		instance_soot_shimple_toolkits_scalar_SConstantPropagatorAndFolder = new soot.shimple.toolkits.scalar.SConstantPropagatorAndFolder(g);
	       	}
       	}
        return instance_soot_shimple_toolkits_scalar_SConstantPropagatorAndFolder;
    }
    protected void release_soot_shimple_toolkits_scalar_SConstantPropagatorAndFolder() {
    	instance_soot_shimple_toolkits_scalar_SConstantPropagatorAndFolder = null;
    }

    private soot.ShortType instance_soot_ShortType;
    public soot.ShortType soot_ShortType() {
        if (instance_soot_ShortType == null) {
	       	synchronized (this) {
		        if (instance_soot_ShortType == null)
	        		instance_soot_ShortType = new soot.ShortType(g);
	       	}
       	}
        return instance_soot_ShortType;
    }
    protected void release_soot_ShortType() {
    	instance_soot_ShortType = null;
    }

    private soot.jimple.toolkits.pointer.SideEffectTagger instance_soot_jimple_toolkits_pointer_SideEffectTagger;
    public soot.jimple.toolkits.pointer.SideEffectTagger soot_jimple_toolkits_pointer_SideEffectTagger() {
        if (instance_soot_jimple_toolkits_pointer_SideEffectTagger == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_pointer_SideEffectTagger == null)
	        		instance_soot_jimple_toolkits_pointer_SideEffectTagger = new soot.jimple.toolkits.pointer.SideEffectTagger(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_pointer_SideEffectTagger;
    }
    protected void release_soot_jimple_toolkits_pointer_SideEffectTagger() {
    	instance_soot_jimple_toolkits_pointer_SideEffectTagger = null;
    }

    private soot.jimple.spark.SparkTransformer instance_soot_jimple_spark_SparkTransformer;
    public soot.jimple.spark.SparkTransformer soot_jimple_spark_SparkTransformer() {
        if (instance_soot_jimple_spark_SparkTransformer == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_spark_SparkTransformer == null)
	        		instance_soot_jimple_spark_SparkTransformer = new soot.jimple.spark.SparkTransformer(g);
	       	}
       	}
        return instance_soot_jimple_spark_SparkTransformer;
    }
    protected void release_soot_jimple_spark_SparkTransformer() {
    	instance_soot_jimple_spark_SparkTransformer = null;
    }

    private soot.jimple.toolkits.invoke.StaticInliner instance_soot_jimple_toolkits_invoke_StaticInliner;
    public soot.jimple.toolkits.invoke.StaticInliner soot_jimple_toolkits_invoke_StaticInliner() {
        if (instance_soot_jimple_toolkits_invoke_StaticInliner == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_invoke_StaticInliner == null)
	        		instance_soot_jimple_toolkits_invoke_StaticInliner = new soot.jimple.toolkits.invoke.StaticInliner(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_invoke_StaticInliner;
    }
    protected void release_soot_jimple_toolkits_invoke_StaticInliner() {
    	instance_soot_jimple_toolkits_invoke_StaticInliner = null;
    }

    private soot.jimple.toolkits.invoke.StaticMethodBinder instance_soot_jimple_toolkits_invoke_StaticMethodBinder;
    public soot.jimple.toolkits.invoke.StaticMethodBinder soot_jimple_toolkits_invoke_StaticMethodBinder() {
        if (instance_soot_jimple_toolkits_invoke_StaticMethodBinder == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_invoke_StaticMethodBinder == null)
	        		instance_soot_jimple_toolkits_invoke_StaticMethodBinder = new soot.jimple.toolkits.invoke.StaticMethodBinder(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_invoke_StaticMethodBinder;
    }
    protected void release_soot_jimple_toolkits_invoke_StaticMethodBinder() {
    	instance_soot_jimple_toolkits_invoke_StaticMethodBinder = null;
    }

    private soot.StmtAddressType instance_soot_StmtAddressType;
    public soot.StmtAddressType soot_StmtAddressType() {
        if (instance_soot_StmtAddressType == null) {
	       	synchronized (this) {
		        if (instance_soot_StmtAddressType == null)
	        		instance_soot_StmtAddressType = new soot.StmtAddressType(g);
	       	}
       	}
        return instance_soot_StmtAddressType;
    }
    protected void release_soot_StmtAddressType() {
    	instance_soot_StmtAddressType = null;
    }

    private soot.dava.toolkits.base.finders.SwitchFinder instance_soot_dava_toolkits_base_finders_SwitchFinder;
    public soot.dava.toolkits.base.finders.SwitchFinder soot_dava_toolkits_base_finders_SwitchFinder() {
        if (instance_soot_dava_toolkits_base_finders_SwitchFinder == null) {
	       	synchronized (this) {
		        if (instance_soot_dava_toolkits_base_finders_SwitchFinder == null)
	        		instance_soot_dava_toolkits_base_finders_SwitchFinder = new soot.dava.toolkits.base.finders.SwitchFinder(g);
	       	}
       	}
        return instance_soot_dava_toolkits_base_finders_SwitchFinder;
    }
    protected void release_soot_dava_toolkits_base_finders_SwitchFinder() {
    	instance_soot_dava_toolkits_base_finders_SwitchFinder = null;
    }

    private soot.dava.toolkits.base.finders.SynchronizedBlockFinder instance_soot_dava_toolkits_base_finders_SynchronizedBlockFinder;
    public soot.dava.toolkits.base.finders.SynchronizedBlockFinder soot_dava_toolkits_base_finders_SynchronizedBlockFinder() {
        if (instance_soot_dava_toolkits_base_finders_SynchronizedBlockFinder == null) {
	       	synchronized (this) {
		        if (instance_soot_dava_toolkits_base_finders_SynchronizedBlockFinder == null)
	        		instance_soot_dava_toolkits_base_finders_SynchronizedBlockFinder = new soot.dava.toolkits.base.finders.SynchronizedBlockFinder(g);
	       	}
       	}
        return instance_soot_dava_toolkits_base_finders_SynchronizedBlockFinder;
    }
    protected void release_soot_dava_toolkits_base_finders_SynchronizedBlockFinder() {
    	instance_soot_dava_toolkits_base_finders_SynchronizedBlockFinder = null;
    }

    private soot.dava.toolkits.base.misc.ThrowFinder instance_soot_dava_toolkits_base_misc_ThrowFinder;
    public soot.dava.toolkits.base.misc.ThrowFinder soot_dava_toolkits_base_misc_ThrowFinder() {
        if (instance_soot_dava_toolkits_base_misc_ThrowFinder == null) {
	       	synchronized (this) {
		        if (instance_soot_dava_toolkits_base_misc_ThrowFinder == null)
	        		instance_soot_dava_toolkits_base_misc_ThrowFinder = new soot.dava.toolkits.base.misc.ThrowFinder(g);
	       	}
       	}
        return instance_soot_dava_toolkits_base_misc_ThrowFinder;
    }
    protected void release_soot_dava_toolkits_base_misc_ThrowFinder() {
    	instance_soot_dava_toolkits_base_misc_ThrowFinder = null;
    }

    private soot.dava.toolkits.base.misc.ThrowNullConverter instance_soot_dava_toolkits_base_misc_ThrowNullConverter;
    public soot.dava.toolkits.base.misc.ThrowNullConverter soot_dava_toolkits_base_misc_ThrowNullConverter() {
        if (instance_soot_dava_toolkits_base_misc_ThrowNullConverter == null) {
	       	synchronized (this) {
		        if (instance_soot_dava_toolkits_base_misc_ThrowNullConverter == null)
	        		instance_soot_dava_toolkits_base_misc_ThrowNullConverter = new soot.dava.toolkits.base.misc.ThrowNullConverter(g);
	       	}
       	}
        return instance_soot_dava_toolkits_base_misc_ThrowNullConverter;
    }
    protected void release_soot_dava_toolkits_base_misc_ThrowNullConverter() {
    	instance_soot_dava_toolkits_base_misc_ThrowNullConverter = null;
    }

    private soot.Timers instance_soot_Timers;
    public soot.Timers soot_Timers() {
        if (instance_soot_Timers == null) {
	       	synchronized (this) {
		        if (instance_soot_Timers == null)
	        		instance_soot_Timers = new soot.Timers(g);
	       	}
       	}
        return instance_soot_Timers;
    }
    protected void release_soot_Timers() {
    	instance_soot_Timers = null;
    }

    private soot.dava.toolkits.base.AST.TryContentsFinder instance_soot_dava_toolkits_base_AST_TryContentsFinder;
    public soot.dava.toolkits.base.AST.TryContentsFinder soot_dava_toolkits_base_AST_TryContentsFinder() {
        if (instance_soot_dava_toolkits_base_AST_TryContentsFinder == null) {
	       	synchronized (this) {
		        if (instance_soot_dava_toolkits_base_AST_TryContentsFinder == null)
	        		instance_soot_dava_toolkits_base_AST_TryContentsFinder = new soot.dava.toolkits.base.AST.TryContentsFinder(g);
	       	}
       	}
        return instance_soot_dava_toolkits_base_AST_TryContentsFinder;
    }
    protected void release_soot_dava_toolkits_base_AST_TryContentsFinder() {
    	instance_soot_dava_toolkits_base_AST_TryContentsFinder = null;
    }

    private soot.jimple.toolkits.typing.TypeAssigner instance_soot_jimple_toolkits_typing_TypeAssigner;
    public soot.jimple.toolkits.typing.TypeAssigner soot_jimple_toolkits_typing_TypeAssigner() {
        if (instance_soot_jimple_toolkits_typing_TypeAssigner == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_typing_TypeAssigner == null)
	        		instance_soot_jimple_toolkits_typing_TypeAssigner = new soot.jimple.toolkits.typing.TypeAssigner(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_typing_TypeAssigner;
    }
    protected void release_soot_jimple_toolkits_typing_TypeAssigner() {
    	instance_soot_jimple_toolkits_typing_TypeAssigner = null;
    }

    private soot.jimple.toolkits.scalar.UnconditionalBranchFolder instance_soot_jimple_toolkits_scalar_UnconditionalBranchFolder;
    public soot.jimple.toolkits.scalar.UnconditionalBranchFolder soot_jimple_toolkits_scalar_UnconditionalBranchFolder() {
        if (instance_soot_jimple_toolkits_scalar_UnconditionalBranchFolder == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_scalar_UnconditionalBranchFolder == null)
	        		instance_soot_jimple_toolkits_scalar_UnconditionalBranchFolder = new soot.jimple.toolkits.scalar.UnconditionalBranchFolder(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_scalar_UnconditionalBranchFolder;
    }
    protected void release_soot_jimple_toolkits_scalar_UnconditionalBranchFolder() {
    	instance_soot_jimple_toolkits_scalar_UnconditionalBranchFolder = null;
    }

    private soot.jimple.toolkits.scalar.ConstantCastEliminator instance_soot_jimple_toolkits_scalar_ConstantCastEliminator;
    public soot.jimple.toolkits.scalar.ConstantCastEliminator soot_jimple_toolkits_scalar_ConstantCastEliminator() {
        if (instance_soot_jimple_toolkits_scalar_ConstantCastEliminator == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_scalar_ConstantCastEliminator == null)
	        		instance_soot_jimple_toolkits_scalar_ConstantCastEliminator = new soot.jimple.toolkits.scalar.ConstantCastEliminator(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_scalar_ConstantCastEliminator;
    }
    protected void release_soot_jimple_toolkits_scalar_ConstantCastEliminator() {
    	instance_soot_jimple_toolkits_scalar_ConstantCastEliminator = null;
    }

    private soot.jimple.toolkits.scalar.IdentityCastEliminator instance_soot_jimple_toolkits_scalar_IdentityCastEliminator;
    public soot.jimple.toolkits.scalar.IdentityCastEliminator soot_jimple_toolkits_scalar_IdentityCastEliminator() {
        if (instance_soot_jimple_toolkits_scalar_IdentityCastEliminator == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_scalar_IdentityCastEliminator == null)
	        		instance_soot_jimple_toolkits_scalar_IdentityCastEliminator = new soot.jimple.toolkits.scalar.IdentityCastEliminator(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_scalar_IdentityCastEliminator;
    }
    protected void release_soot_jimple_toolkits_scalar_IdentityCastEliminator() {
    	instance_soot_jimple_toolkits_scalar_IdentityCastEliminator = null;
    }

    private soot.jimple.toolkits.scalar.FieldStaticnessCorrector instance_soot_jimple_toolkits_scalar_FieldStaticnessCorrector;
    public soot.jimple.toolkits.scalar.FieldStaticnessCorrector soot_jimple_toolkits_scalar_FieldStaticnessCorrector() {
        if (instance_soot_jimple_toolkits_scalar_FieldStaticnessCorrector == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_scalar_FieldStaticnessCorrector == null)
	        		instance_soot_jimple_toolkits_scalar_FieldStaticnessCorrector = new soot.jimple.toolkits.scalar.FieldStaticnessCorrector(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_scalar_FieldStaticnessCorrector;
    }
    protected void release_soot_jimple_toolkits_scalar_FieldStaticnessCorrector() {
    	instance_soot_jimple_toolkits_scalar_FieldStaticnessCorrector = null;
    }

    private soot.jimple.toolkits.scalar.MethodStaticnessCorrector instance_soot_jimple_toolkits_scalar_MethodStaticnessCorrector;
    public soot.jimple.toolkits.scalar.MethodStaticnessCorrector soot_jimple_toolkits_scalar_MethodStaticnessCorrector() {
        if (instance_soot_jimple_toolkits_scalar_MethodStaticnessCorrector == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_scalar_MethodStaticnessCorrector == null)
	        		instance_soot_jimple_toolkits_scalar_MethodStaticnessCorrector = new soot.jimple.toolkits.scalar.MethodStaticnessCorrector(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_scalar_MethodStaticnessCorrector;
    }
    protected void release_soot_jimple_toolkits_scalar_MethodStaticnessCorrector() {
    	instance_soot_jimple_toolkits_scalar_MethodStaticnessCorrector = null;
    }

    private soot.jimple.toolkits.scalar.IdentityOperationEliminator instance_soot_jimple_toolkits_scalar_IdentityOperationEliminator;
    public soot.jimple.toolkits.scalar.IdentityOperationEliminator soot_jimple_toolkits_scalar_IdentityOperationEliminator() {
        if (instance_soot_jimple_toolkits_scalar_IdentityOperationEliminator == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_scalar_IdentityOperationEliminator == null)
	        		instance_soot_jimple_toolkits_scalar_IdentityOperationEliminator = new soot.jimple.toolkits.scalar.IdentityOperationEliminator(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_scalar_IdentityOperationEliminator;
    }
    protected void release_soot_jimple_toolkits_scalar_IdentityOperationEliminator() {
    	instance_soot_jimple_toolkits_scalar_IdentityOperationEliminator = null;
    }

    private soot.UnknownType instance_soot_UnknownType;
    public soot.UnknownType soot_UnknownType() {
        if (instance_soot_UnknownType == null) {
	       	synchronized (this) {
		        if (instance_soot_UnknownType == null)
	        		instance_soot_UnknownType = new soot.UnknownType(g);
	       	}
       	}
        return instance_soot_UnknownType;
    }
    protected void release_soot_UnknownType() {
    	instance_soot_UnknownType = null;
    }

    private soot.jimple.toolkits.scalar.UnreachableCodeEliminator instance_soot_jimple_toolkits_scalar_UnreachableCodeEliminator;
    public soot.jimple.toolkits.scalar.UnreachableCodeEliminator soot_jimple_toolkits_scalar_UnreachableCodeEliminator() {
        if (instance_soot_jimple_toolkits_scalar_UnreachableCodeEliminator == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_scalar_UnreachableCodeEliminator == null)
	        		instance_soot_jimple_toolkits_scalar_UnreachableCodeEliminator = new soot.jimple.toolkits.scalar.UnreachableCodeEliminator(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_scalar_UnreachableCodeEliminator;
    }
    protected void release_soot_jimple_toolkits_scalar_UnreachableCodeEliminator() {
    	instance_soot_jimple_toolkits_scalar_UnreachableCodeEliminator = null;
    }

    private soot.toolkits.scalar.UnusedLocalEliminator instance_soot_toolkits_scalar_UnusedLocalEliminator;
    public soot.toolkits.scalar.UnusedLocalEliminator soot_toolkits_scalar_UnusedLocalEliminator() {
        if (instance_soot_toolkits_scalar_UnusedLocalEliminator == null) {
	       	synchronized (this) {
		        if (instance_soot_toolkits_scalar_UnusedLocalEliminator == null)
	        		instance_soot_toolkits_scalar_UnusedLocalEliminator = new soot.toolkits.scalar.UnusedLocalEliminator(g);
	       	}
       	}
        return instance_soot_toolkits_scalar_UnusedLocalEliminator;
    }
    protected void release_soot_toolkits_scalar_UnusedLocalEliminator() {
    	instance_soot_toolkits_scalar_UnusedLocalEliminator = null;
    }

    private soot.coffi.UnusuableType instance_soot_coffi_UnusuableType;
    public soot.coffi.UnusuableType soot_coffi_UnusuableType() {
        if (instance_soot_coffi_UnusuableType == null) {
	       	synchronized (this) {
		        if (instance_soot_coffi_UnusuableType == null)
	        		instance_soot_coffi_UnusuableType = new soot.coffi.UnusuableType(g);
	       	}
       	}
        return instance_soot_coffi_UnusuableType;
    }
    protected void release_soot_coffi_UnusuableType() {
    	instance_soot_coffi_UnusuableType = null;
    }

    private soot.dava.toolkits.base.AST.UselessTryRemover instance_soot_dava_toolkits_base_AST_UselessTryRemover;
    public soot.dava.toolkits.base.AST.UselessTryRemover soot_dava_toolkits_base_AST_UselessTryRemover() {
        if (instance_soot_dava_toolkits_base_AST_UselessTryRemover == null) {
	       	synchronized (this) {
		        if (instance_soot_dava_toolkits_base_AST_UselessTryRemover == null)
	        		instance_soot_dava_toolkits_base_AST_UselessTryRemover = new soot.dava.toolkits.base.AST.UselessTryRemover(g);
	       	}
       	}
        return instance_soot_dava_toolkits_base_AST_UselessTryRemover;
    }
    protected void release_soot_dava_toolkits_base_AST_UselessTryRemover() {
    	instance_soot_dava_toolkits_base_AST_UselessTryRemover = null;
    }

    private soot.VoidType instance_soot_VoidType;
    public soot.VoidType soot_VoidType() {
        if (instance_soot_VoidType == null) {
	       	synchronized (this) {
		        if (instance_soot_VoidType == null)
	        		instance_soot_VoidType = new soot.VoidType(g);
	       	}
       	}
        return instance_soot_VoidType;
    }
    protected void release_soot_VoidType() {
    	instance_soot_VoidType = null;
    }

    private soot.baf.WordType instance_soot_baf_WordType;
    public soot.baf.WordType soot_baf_WordType() {
        if (instance_soot_baf_WordType == null) {
	       	synchronized (this) {
		        if (instance_soot_baf_WordType == null)
	        		instance_soot_baf_WordType = new soot.baf.WordType(g);
	       	}
       	}
        return instance_soot_baf_WordType;
    }
    protected void release_soot_baf_WordType() {
    	instance_soot_baf_WordType = null;
    }

    private soot.jimple.spark.fieldrw.FieldReadTagAggregator instance_soot_jimple_spark_fieldrw_FieldReadTagAggregator;
    public soot.jimple.spark.fieldrw.FieldReadTagAggregator soot_jimple_spark_fieldrw_FieldReadTagAggregator() {
        if (instance_soot_jimple_spark_fieldrw_FieldReadTagAggregator == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_spark_fieldrw_FieldReadTagAggregator == null)
	        		instance_soot_jimple_spark_fieldrw_FieldReadTagAggregator = new soot.jimple.spark.fieldrw.FieldReadTagAggregator(g);
	       	}
       	}
        return instance_soot_jimple_spark_fieldrw_FieldReadTagAggregator;
    }
    protected void release_soot_jimple_spark_fieldrw_FieldReadTagAggregator() {
    	instance_soot_jimple_spark_fieldrw_FieldReadTagAggregator = null;
    }

    private soot.jimple.spark.fieldrw.FieldWriteTagAggregator instance_soot_jimple_spark_fieldrw_FieldWriteTagAggregator;
    public soot.jimple.spark.fieldrw.FieldWriteTagAggregator soot_jimple_spark_fieldrw_FieldWriteTagAggregator() {
        if (instance_soot_jimple_spark_fieldrw_FieldWriteTagAggregator == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_spark_fieldrw_FieldWriteTagAggregator == null)
	        		instance_soot_jimple_spark_fieldrw_FieldWriteTagAggregator = new soot.jimple.spark.fieldrw.FieldWriteTagAggregator(g);
	       	}
       	}
        return instance_soot_jimple_spark_fieldrw_FieldWriteTagAggregator;
    }
    protected void release_soot_jimple_spark_fieldrw_FieldWriteTagAggregator() {
    	instance_soot_jimple_spark_fieldrw_FieldWriteTagAggregator = null;
    }

    private soot.jimple.spark.fieldrw.FieldTagAggregator instance_soot_jimple_spark_fieldrw_FieldTagAggregator;
    public soot.jimple.spark.fieldrw.FieldTagAggregator soot_jimple_spark_fieldrw_FieldTagAggregator() {
        if (instance_soot_jimple_spark_fieldrw_FieldTagAggregator == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_spark_fieldrw_FieldTagAggregator == null)
	        		instance_soot_jimple_spark_fieldrw_FieldTagAggregator = new soot.jimple.spark.fieldrw.FieldTagAggregator(g);
	       	}
       	}
        return instance_soot_jimple_spark_fieldrw_FieldTagAggregator;
    }
    protected void release_soot_jimple_spark_fieldrw_FieldTagAggregator() {
    	instance_soot_jimple_spark_fieldrw_FieldTagAggregator = null;
    }

    private soot.EntryPoints instance_soot_EntryPoints;
    public soot.EntryPoints soot_EntryPoints() {
        if (instance_soot_EntryPoints == null) {
	       	synchronized (this) {
		        if (instance_soot_EntryPoints == null)
	        		instance_soot_EntryPoints = new soot.EntryPoints(g);
	       	}
       	}
        return instance_soot_EntryPoints;
    }
    protected void release_soot_EntryPoints() {
    	instance_soot_EntryPoints = null;
    }

    private soot.jimple.toolkits.annotation.callgraph.CallGraphTagger instance_soot_jimple_toolkits_annotation_callgraph_CallGraphTagger;
    public soot.jimple.toolkits.annotation.callgraph.CallGraphTagger soot_jimple_toolkits_annotation_callgraph_CallGraphTagger() {
        if (instance_soot_jimple_toolkits_annotation_callgraph_CallGraphTagger == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_annotation_callgraph_CallGraphTagger == null)
	        		instance_soot_jimple_toolkits_annotation_callgraph_CallGraphTagger = new soot.jimple.toolkits.annotation.callgraph.CallGraphTagger(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_annotation_callgraph_CallGraphTagger;
    }
    protected void release_soot_jimple_toolkits_annotation_callgraph_CallGraphTagger() {
    	instance_soot_jimple_toolkits_annotation_callgraph_CallGraphTagger = null;
    }

    private soot.jimple.toolkits.annotation.nullcheck.NullPointerColorer instance_soot_jimple_toolkits_annotation_nullcheck_NullPointerColorer;
    public soot.jimple.toolkits.annotation.nullcheck.NullPointerColorer soot_jimple_toolkits_annotation_nullcheck_NullPointerColorer() {
        if (instance_soot_jimple_toolkits_annotation_nullcheck_NullPointerColorer == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_annotation_nullcheck_NullPointerColorer == null)
	        		instance_soot_jimple_toolkits_annotation_nullcheck_NullPointerColorer = new soot.jimple.toolkits.annotation.nullcheck.NullPointerColorer(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_annotation_nullcheck_NullPointerColorer;
    }
    protected void release_soot_jimple_toolkits_annotation_nullcheck_NullPointerColorer() {
    	instance_soot_jimple_toolkits_annotation_nullcheck_NullPointerColorer = null;
    }

    private soot.jimple.toolkits.annotation.parity.ParityTagger instance_soot_jimple_toolkits_annotation_parity_ParityTagger;
    public soot.jimple.toolkits.annotation.parity.ParityTagger soot_jimple_toolkits_annotation_parity_ParityTagger() {
        if (instance_soot_jimple_toolkits_annotation_parity_ParityTagger == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_annotation_parity_ParityTagger == null)
	        		instance_soot_jimple_toolkits_annotation_parity_ParityTagger = new soot.jimple.toolkits.annotation.parity.ParityTagger(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_annotation_parity_ParityTagger;
    }
    protected void release_soot_jimple_toolkits_annotation_parity_ParityTagger() {
    	instance_soot_jimple_toolkits_annotation_parity_ParityTagger = null;
    }

    private soot.jimple.toolkits.annotation.methods.UnreachableMethodsTagger instance_soot_jimple_toolkits_annotation_methods_UnreachableMethodsTagger;
    public soot.jimple.toolkits.annotation.methods.UnreachableMethodsTagger soot_jimple_toolkits_annotation_methods_UnreachableMethodsTagger() {
        if (instance_soot_jimple_toolkits_annotation_methods_UnreachableMethodsTagger == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_annotation_methods_UnreachableMethodsTagger == null)
	        		instance_soot_jimple_toolkits_annotation_methods_UnreachableMethodsTagger = new soot.jimple.toolkits.annotation.methods.UnreachableMethodsTagger(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_annotation_methods_UnreachableMethodsTagger;
    }
    protected void release_soot_jimple_toolkits_annotation_methods_UnreachableMethodsTagger() {
    	instance_soot_jimple_toolkits_annotation_methods_UnreachableMethodsTagger = null;
    }

    private soot.jimple.toolkits.annotation.fields.UnreachableFieldsTagger instance_soot_jimple_toolkits_annotation_fields_UnreachableFieldsTagger;
    public soot.jimple.toolkits.annotation.fields.UnreachableFieldsTagger soot_jimple_toolkits_annotation_fields_UnreachableFieldsTagger() {
        if (instance_soot_jimple_toolkits_annotation_fields_UnreachableFieldsTagger == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_annotation_fields_UnreachableFieldsTagger == null)
	        		instance_soot_jimple_toolkits_annotation_fields_UnreachableFieldsTagger = new soot.jimple.toolkits.annotation.fields.UnreachableFieldsTagger(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_annotation_fields_UnreachableFieldsTagger;
    }
    protected void release_soot_jimple_toolkits_annotation_fields_UnreachableFieldsTagger() {
    	instance_soot_jimple_toolkits_annotation_fields_UnreachableFieldsTagger = null;
    }

    private soot.jimple.toolkits.annotation.qualifiers.TightestQualifiersTagger instance_soot_jimple_toolkits_annotation_qualifiers_TightestQualifiersTagger;
    public soot.jimple.toolkits.annotation.qualifiers.TightestQualifiersTagger soot_jimple_toolkits_annotation_qualifiers_TightestQualifiersTagger() {
        if (instance_soot_jimple_toolkits_annotation_qualifiers_TightestQualifiersTagger == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_annotation_qualifiers_TightestQualifiersTagger == null)
	        		instance_soot_jimple_toolkits_annotation_qualifiers_TightestQualifiersTagger = new soot.jimple.toolkits.annotation.qualifiers.TightestQualifiersTagger(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_annotation_qualifiers_TightestQualifiersTagger;
    }
    protected void release_soot_jimple_toolkits_annotation_qualifiers_TightestQualifiersTagger() {
    	instance_soot_jimple_toolkits_annotation_qualifiers_TightestQualifiersTagger = null;
    }

    private soot.jimple.toolkits.pointer.ParameterAliasTagger instance_soot_jimple_toolkits_pointer_ParameterAliasTagger;
    public soot.jimple.toolkits.pointer.ParameterAliasTagger soot_jimple_toolkits_pointer_ParameterAliasTagger() {
        if (instance_soot_jimple_toolkits_pointer_ParameterAliasTagger == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_pointer_ParameterAliasTagger == null)
	        		instance_soot_jimple_toolkits_pointer_ParameterAliasTagger = new soot.jimple.toolkits.pointer.ParameterAliasTagger(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_pointer_ParameterAliasTagger;
    }
    protected void release_soot_jimple_toolkits_pointer_ParameterAliasTagger() {
    	instance_soot_jimple_toolkits_pointer_ParameterAliasTagger = null;
    }

    private soot.jimple.toolkits.annotation.defs.ReachingDefsTagger instance_soot_jimple_toolkits_annotation_defs_ReachingDefsTagger;
    public soot.jimple.toolkits.annotation.defs.ReachingDefsTagger soot_jimple_toolkits_annotation_defs_ReachingDefsTagger() {
        if (instance_soot_jimple_toolkits_annotation_defs_ReachingDefsTagger == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_annotation_defs_ReachingDefsTagger == null)
	        		instance_soot_jimple_toolkits_annotation_defs_ReachingDefsTagger = new soot.jimple.toolkits.annotation.defs.ReachingDefsTagger(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_annotation_defs_ReachingDefsTagger;
    }
    protected void release_soot_jimple_toolkits_annotation_defs_ReachingDefsTagger() {
    	instance_soot_jimple_toolkits_annotation_defs_ReachingDefsTagger = null;
    }

    private soot.jimple.toolkits.annotation.liveness.LiveVarsTagger instance_soot_jimple_toolkits_annotation_liveness_LiveVarsTagger;
    public soot.jimple.toolkits.annotation.liveness.LiveVarsTagger soot_jimple_toolkits_annotation_liveness_LiveVarsTagger() {
        if (instance_soot_jimple_toolkits_annotation_liveness_LiveVarsTagger == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_annotation_liveness_LiveVarsTagger == null)
	        		instance_soot_jimple_toolkits_annotation_liveness_LiveVarsTagger = new soot.jimple.toolkits.annotation.liveness.LiveVarsTagger(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_annotation_liveness_LiveVarsTagger;
    }
    protected void release_soot_jimple_toolkits_annotation_liveness_LiveVarsTagger() {
    	instance_soot_jimple_toolkits_annotation_liveness_LiveVarsTagger = null;
    }

    private soot.toolkits.graph.interaction.InteractionHandler instance_soot_toolkits_graph_interaction_InteractionHandler;
    public soot.toolkits.graph.interaction.InteractionHandler soot_toolkits_graph_interaction_InteractionHandler() {
        if (instance_soot_toolkits_graph_interaction_InteractionHandler == null) {
	       	synchronized (this) {
		        if (instance_soot_toolkits_graph_interaction_InteractionHandler == null)
	        		instance_soot_toolkits_graph_interaction_InteractionHandler = new soot.toolkits.graph.interaction.InteractionHandler(g);
	       	}
       	}
        return instance_soot_toolkits_graph_interaction_InteractionHandler;
    }
    protected void release_soot_toolkits_graph_interaction_InteractionHandler() {
    	instance_soot_toolkits_graph_interaction_InteractionHandler = null;
    }

    private soot.jimple.toolkits.annotation.logic.LoopInvariantFinder instance_soot_jimple_toolkits_annotation_logic_LoopInvariantFinder;
    public soot.jimple.toolkits.annotation.logic.LoopInvariantFinder soot_jimple_toolkits_annotation_logic_LoopInvariantFinder() {
        if (instance_soot_jimple_toolkits_annotation_logic_LoopInvariantFinder == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_annotation_logic_LoopInvariantFinder == null)
	        		instance_soot_jimple_toolkits_annotation_logic_LoopInvariantFinder = new soot.jimple.toolkits.annotation.logic.LoopInvariantFinder(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_annotation_logic_LoopInvariantFinder;
    }
    protected void release_soot_jimple_toolkits_annotation_logic_LoopInvariantFinder() {
    	instance_soot_jimple_toolkits_annotation_logic_LoopInvariantFinder = null;
    }

    private soot.jimple.toolkits.annotation.AvailExprTagger instance_soot_jimple_toolkits_annotation_AvailExprTagger;
    public soot.jimple.toolkits.annotation.AvailExprTagger soot_jimple_toolkits_annotation_AvailExprTagger() {
        if (instance_soot_jimple_toolkits_annotation_AvailExprTagger == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_annotation_AvailExprTagger == null)
	        		instance_soot_jimple_toolkits_annotation_AvailExprTagger = new soot.jimple.toolkits.annotation.AvailExprTagger(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_annotation_AvailExprTagger;
    }
    protected void release_soot_jimple_toolkits_annotation_AvailExprTagger() {
    	instance_soot_jimple_toolkits_annotation_AvailExprTagger = null;
    }

    private soot.util.PhaseDumper instance_soot_util_PhaseDumper;
    public soot.util.PhaseDumper soot_util_PhaseDumper() {
        if (instance_soot_util_PhaseDumper == null) {
	       	synchronized (this) {
		        if (instance_soot_util_PhaseDumper == null)
	        		instance_soot_util_PhaseDumper = new soot.util.PhaseDumper(g);
	       	}
       	}
        return instance_soot_util_PhaseDumper;
    }
    protected void release_soot_util_PhaseDumper() {
    	instance_soot_util_PhaseDumper = null;
    }

    private soot.util.cfgcmd.AltClassLoader instance_soot_util_cfgcmd_AltClassLoader;
    public soot.util.cfgcmd.AltClassLoader soot_util_cfgcmd_AltClassLoader() {
        if (instance_soot_util_cfgcmd_AltClassLoader == null) {
	       	synchronized (this) {
		        if (instance_soot_util_cfgcmd_AltClassLoader == null)
	        		instance_soot_util_cfgcmd_AltClassLoader = new soot.util.cfgcmd.AltClassLoader(g);
	       	}
       	}
        return instance_soot_util_cfgcmd_AltClassLoader;
    }
    protected void release_soot_util_cfgcmd_AltClassLoader() {
    	instance_soot_util_cfgcmd_AltClassLoader = null;
    }

    private soot.toolkits.exceptions.ThrowableSet.Manager instance_soot_toolkits_exceptions_ThrowableSet_Manager;
    public soot.toolkits.exceptions.ThrowableSet.Manager soot_toolkits_exceptions_ThrowableSet_Manager() {
        if (instance_soot_toolkits_exceptions_ThrowableSet_Manager == null) {
	       	synchronized (this) {
		        if (instance_soot_toolkits_exceptions_ThrowableSet_Manager == null)
	        		instance_soot_toolkits_exceptions_ThrowableSet_Manager = new soot.toolkits.exceptions.ThrowableSet.Manager(g);
	       	}
       	}
        return instance_soot_toolkits_exceptions_ThrowableSet_Manager;
    }
    protected void release_soot_toolkits_exceptions_ThrowableSet_Manager() {
    	instance_soot_toolkits_exceptions_ThrowableSet_Manager = null;
    }

    private soot.toolkits.exceptions.UnitThrowAnalysis instance_soot_toolkits_exceptions_UnitThrowAnalysis;
    public soot.toolkits.exceptions.UnitThrowAnalysis soot_toolkits_exceptions_UnitThrowAnalysis() {
        if (instance_soot_toolkits_exceptions_UnitThrowAnalysis == null) {
	       	synchronized (this) {
		        if (instance_soot_toolkits_exceptions_UnitThrowAnalysis == null)
	        		instance_soot_toolkits_exceptions_UnitThrowAnalysis = new soot.toolkits.exceptions.UnitThrowAnalysis(g);
	       	}
       	}
        return instance_soot_toolkits_exceptions_UnitThrowAnalysis;
    }
    protected void release_soot_toolkits_exceptions_UnitThrowAnalysis() {
    	instance_soot_toolkits_exceptions_UnitThrowAnalysis = null;
    }

    private soot.dexpler.DalvikThrowAnalysis instance_soot_dexpler_DalvikThrowAnalysis;
    public soot.dexpler.DalvikThrowAnalysis soot_dexpler_DalvikThrowAnalysis() {
        if (instance_soot_dexpler_DalvikThrowAnalysis == null) {
	       	synchronized (this) {
		        if (instance_soot_dexpler_DalvikThrowAnalysis == null)
	        		instance_soot_dexpler_DalvikThrowAnalysis = new soot.dexpler.DalvikThrowAnalysis(g);
	       	}
       	}
        return instance_soot_dexpler_DalvikThrowAnalysis;
    }
    protected void release_soot_dexpler_DalvikThrowAnalysis() {
    	instance_soot_dexpler_DalvikThrowAnalysis = null;
    }

    private soot.dexpler.DexFileProvider instance_soot_dexpler_DexFileProvider;
    public soot.dexpler.DexFileProvider soot_dexpler_DexFileProvider() {
        if (instance_soot_dexpler_DexFileProvider == null) {
	       	synchronized (this) {
		        if (instance_soot_dexpler_DexFileProvider == null)
	        		instance_soot_dexpler_DexFileProvider = new soot.dexpler.DexFileProvider(g);
	       	}
       	}
        return instance_soot_dexpler_DexFileProvider;
    }
    protected void release_soot_dexpler_DexFileProvider() {
    	instance_soot_dexpler_DexFileProvider = null;
    }

    private soot.toolkits.exceptions.PedanticThrowAnalysis instance_soot_toolkits_exceptions_PedanticThrowAnalysis;
    public soot.toolkits.exceptions.PedanticThrowAnalysis soot_toolkits_exceptions_PedanticThrowAnalysis() {
        if (instance_soot_toolkits_exceptions_PedanticThrowAnalysis == null) {
	       	synchronized (this) {
		        if (instance_soot_toolkits_exceptions_PedanticThrowAnalysis == null)
	        		instance_soot_toolkits_exceptions_PedanticThrowAnalysis = new soot.toolkits.exceptions.PedanticThrowAnalysis(g);
	       	}
       	}
        return instance_soot_toolkits_exceptions_PedanticThrowAnalysis;
    }
    protected void release_soot_toolkits_exceptions_PedanticThrowAnalysis() {
    	instance_soot_toolkits_exceptions_PedanticThrowAnalysis = null;
    }

    private soot.toolkits.exceptions.TrapTightener instance_soot_toolkits_exceptions_TrapTightener;
    public soot.toolkits.exceptions.TrapTightener soot_toolkits_exceptions_TrapTightener() {
        if (instance_soot_toolkits_exceptions_TrapTightener == null) {
	       	synchronized (this) {
		        if (instance_soot_toolkits_exceptions_TrapTightener == null)
	        		instance_soot_toolkits_exceptions_TrapTightener = new soot.toolkits.exceptions.TrapTightener(g);
	       	}
       	}
        return instance_soot_toolkits_exceptions_TrapTightener;
    }
    protected void release_soot_toolkits_exceptions_TrapTightener() {
    	instance_soot_toolkits_exceptions_TrapTightener = null;
    }

    private soot.toolkits.exceptions.DuplicateCatchAllTrapRemover instance_soot_toolkits_exceptions_DuplicateCatchAllTrapRemover;
    public soot.toolkits.exceptions.DuplicateCatchAllTrapRemover soot_toolkits_exceptions_DuplicateCatchAllTrapRemover() {
        if (instance_soot_toolkits_exceptions_DuplicateCatchAllTrapRemover == null) {
	       	synchronized (this) {
		        if (instance_soot_toolkits_exceptions_DuplicateCatchAllTrapRemover == null)
	        		instance_soot_toolkits_exceptions_DuplicateCatchAllTrapRemover = new soot.toolkits.exceptions.DuplicateCatchAllTrapRemover(g);
	       	}
       	}
        return instance_soot_toolkits_exceptions_DuplicateCatchAllTrapRemover;
    }
    protected void release_soot_toolkits_exceptions_DuplicateCatchAllTrapRemover() {
    	instance_soot_toolkits_exceptions_DuplicateCatchAllTrapRemover = null;
    }

    private soot.jimple.toolkits.annotation.callgraph.CallGraphGrapher instance_soot_jimple_toolkits_annotation_callgraph_CallGraphGrapher;
    public soot.jimple.toolkits.annotation.callgraph.CallGraphGrapher soot_jimple_toolkits_annotation_callgraph_CallGraphGrapher() {
        if (instance_soot_jimple_toolkits_annotation_callgraph_CallGraphGrapher == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_annotation_callgraph_CallGraphGrapher == null)
	        		instance_soot_jimple_toolkits_annotation_callgraph_CallGraphGrapher = new soot.jimple.toolkits.annotation.callgraph.CallGraphGrapher(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_annotation_callgraph_CallGraphGrapher;
    }
    protected void release_soot_jimple_toolkits_annotation_callgraph_CallGraphGrapher() {
    	instance_soot_jimple_toolkits_annotation_callgraph_CallGraphGrapher = null;
    }

    private soot.SootResolver instance_soot_SootResolver;
    public soot.SootResolver soot_SootResolver() {
        if (instance_soot_SootResolver == null) {
	       	synchronized (this) {
		        if (instance_soot_SootResolver == null)
	        		instance_soot_SootResolver = new soot.SootResolver(g);
	       	}
       	}
        return instance_soot_SootResolver;
    }
    protected void release_soot_SootResolver() {
    	instance_soot_SootResolver = null;
    }

    private soot.javaToJimple.InitialResolver instance_soot_javaToJimple_InitialResolver;
    public soot.javaToJimple.InitialResolver soot_javaToJimple_InitialResolver() {
        if (instance_soot_javaToJimple_InitialResolver == null) {
	       	synchronized (this) {
		        if (instance_soot_javaToJimple_InitialResolver == null)
	        		instance_soot_javaToJimple_InitialResolver = new soot.javaToJimple.InitialResolver(g);
	       	}
       	}
        return instance_soot_javaToJimple_InitialResolver;
    }
    protected void release_soot_javaToJimple_InitialResolver() {
    	instance_soot_javaToJimple_InitialResolver = null;
    }

    private soot.jimple.paddle.PaddleHook instance_soot_jimple_paddle_PaddleHook;
    public soot.jimple.paddle.PaddleHook soot_jimple_paddle_PaddleHook() {
        if (instance_soot_jimple_paddle_PaddleHook == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_paddle_PaddleHook == null)
	        		instance_soot_jimple_paddle_PaddleHook = new soot.jimple.paddle.PaddleHook(g);
	       	}
       	}
        return instance_soot_jimple_paddle_PaddleHook;
    }
    protected void release_soot_jimple_paddle_PaddleHook() {
    	instance_soot_jimple_paddle_PaddleHook = null;
    }

    private soot.jimple.toolkits.annotation.DominatorsTagger instance_soot_jimple_toolkits_annotation_DominatorsTagger;
    public soot.jimple.toolkits.annotation.DominatorsTagger soot_jimple_toolkits_annotation_DominatorsTagger() {
        if (instance_soot_jimple_toolkits_annotation_DominatorsTagger == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_annotation_DominatorsTagger == null)
	        		instance_soot_jimple_toolkits_annotation_DominatorsTagger = new soot.jimple.toolkits.annotation.DominatorsTagger(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_annotation_DominatorsTagger;
    }
    protected void release_soot_jimple_toolkits_annotation_DominatorsTagger() {
    	instance_soot_jimple_toolkits_annotation_DominatorsTagger = null;
    }

    private soot.jimple.toolkits.annotation.purity.PurityAnalysis instance_soot_jimple_toolkits_annotation_purity_PurityAnalysis;
    public soot.jimple.toolkits.annotation.purity.PurityAnalysis soot_jimple_toolkits_annotation_purity_PurityAnalysis() {
        if (instance_soot_jimple_toolkits_annotation_purity_PurityAnalysis == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_annotation_purity_PurityAnalysis == null)
	        		instance_soot_jimple_toolkits_annotation_purity_PurityAnalysis = new soot.jimple.toolkits.annotation.purity.PurityAnalysis(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_annotation_purity_PurityAnalysis;
    }
    protected void release_soot_jimple_toolkits_annotation_purity_PurityAnalysis() {
    	instance_soot_jimple_toolkits_annotation_purity_PurityAnalysis = null;
    }

    private soot.javaToJimple.toolkits.CondTransformer instance_soot_javaToJimple_toolkits_CondTransformer;
    public soot.javaToJimple.toolkits.CondTransformer soot_javaToJimple_toolkits_CondTransformer() {
        if (instance_soot_javaToJimple_toolkits_CondTransformer == null) {
	       	synchronized (this) {
		        if (instance_soot_javaToJimple_toolkits_CondTransformer == null)
	        		instance_soot_javaToJimple_toolkits_CondTransformer = new soot.javaToJimple.toolkits.CondTransformer(g);
	       	}
       	}
        return instance_soot_javaToJimple_toolkits_CondTransformer;
    }
    protected void release_soot_javaToJimple_toolkits_CondTransformer() {
    	instance_soot_javaToJimple_toolkits_CondTransformer = null;
    }

    private soot.dava.toolkits.base.AST.transformations.UselessLabelFinder instance_soot_dava_toolkits_base_AST_transformations_UselessLabelFinder;
    public soot.dava.toolkits.base.AST.transformations.UselessLabelFinder soot_dava_toolkits_base_AST_transformations_UselessLabelFinder() {
        if (instance_soot_dava_toolkits_base_AST_transformations_UselessLabelFinder == null) {
	       	synchronized (this) {
		        if (instance_soot_dava_toolkits_base_AST_transformations_UselessLabelFinder == null)
	        		instance_soot_dava_toolkits_base_AST_transformations_UselessLabelFinder = new soot.dava.toolkits.base.AST.transformations.UselessLabelFinder(g);
	       	}
       	}
        return instance_soot_dava_toolkits_base_AST_transformations_UselessLabelFinder;
    }
    protected void release_soot_dava_toolkits_base_AST_transformations_UselessLabelFinder() {
    	instance_soot_dava_toolkits_base_AST_transformations_UselessLabelFinder = null;
    }

    private soot.dava.DavaStaticBlockCleaner instance_soot_dava_DavaStaticBlockCleaner;
    public soot.dava.DavaStaticBlockCleaner soot_dava_DavaStaticBlockCleaner() {
        if (instance_soot_dava_DavaStaticBlockCleaner == null) {
	       	synchronized (this) {
		        if (instance_soot_dava_DavaStaticBlockCleaner == null)
	        		instance_soot_dava_DavaStaticBlockCleaner = new soot.dava.DavaStaticBlockCleaner(g);
	       	}
       	}
        return instance_soot_dava_DavaStaticBlockCleaner;
    }
    protected void release_soot_dava_DavaStaticBlockCleaner() {
    	instance_soot_dava_DavaStaticBlockCleaner = null;
    }

    private soot.dava.toolkits.base.AST.traversals.ClosestAbruptTargetFinder instance_soot_dava_toolkits_base_AST_traversals_ClosestAbruptTargetFinder;
    public soot.dava.toolkits.base.AST.traversals.ClosestAbruptTargetFinder soot_dava_toolkits_base_AST_traversals_ClosestAbruptTargetFinder() {
        if (instance_soot_dava_toolkits_base_AST_traversals_ClosestAbruptTargetFinder == null) {
	       	synchronized (this) {
		        if (instance_soot_dava_toolkits_base_AST_traversals_ClosestAbruptTargetFinder == null)
	        		instance_soot_dava_toolkits_base_AST_traversals_ClosestAbruptTargetFinder = new soot.dava.toolkits.base.AST.traversals.ClosestAbruptTargetFinder(g);
	       	}
       	}
        return instance_soot_dava_toolkits_base_AST_traversals_ClosestAbruptTargetFinder;
    }
    protected void release_soot_dava_toolkits_base_AST_traversals_ClosestAbruptTargetFinder() {
    	instance_soot_dava_toolkits_base_AST_traversals_ClosestAbruptTargetFinder = null;
    }

    private soot.jimple.spark.sets.AllSharedListNodes instance_soot_jimple_spark_sets_AllSharedListNodes;
    public soot.jimple.spark.sets.AllSharedListNodes soot_jimple_spark_sets_AllSharedListNodes() {
        if (instance_soot_jimple_spark_sets_AllSharedListNodes == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_spark_sets_AllSharedListNodes == null)
	        		instance_soot_jimple_spark_sets_AllSharedListNodes = new soot.jimple.spark.sets.AllSharedListNodes(g);
	       	}
       	}
        return instance_soot_jimple_spark_sets_AllSharedListNodes;
    }
    protected void release_soot_jimple_spark_sets_AllSharedListNodes() {
    	instance_soot_jimple_spark_sets_AllSharedListNodes = null;
    }

    private soot.jimple.spark.sets.AllSharedHybridNodes instance_soot_jimple_spark_sets_AllSharedHybridNodes;
    public soot.jimple.spark.sets.AllSharedHybridNodes soot_jimple_spark_sets_AllSharedHybridNodes() {
        if (instance_soot_jimple_spark_sets_AllSharedHybridNodes == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_spark_sets_AllSharedHybridNodes == null)
	        		instance_soot_jimple_spark_sets_AllSharedHybridNodes = new soot.jimple.spark.sets.AllSharedHybridNodes(g);
	       	}
       	}
        return instance_soot_jimple_spark_sets_AllSharedHybridNodes;
    }
    protected void release_soot_jimple_spark_sets_AllSharedHybridNodes() {
    	instance_soot_jimple_spark_sets_AllSharedHybridNodes = null;
    }

    private soot.jimple.toolkits.thread.synchronization.LockAllocator instance_soot_jimple_toolkits_thread_synchronization_LockAllocator;
    public soot.jimple.toolkits.thread.synchronization.LockAllocator soot_jimple_toolkits_thread_synchronization_LockAllocator() {
        if (instance_soot_jimple_toolkits_thread_synchronization_LockAllocator == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_thread_synchronization_LockAllocator == null)
	        		instance_soot_jimple_toolkits_thread_synchronization_LockAllocator = new soot.jimple.toolkits.thread.synchronization.LockAllocator(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_thread_synchronization_LockAllocator;
    }
    protected void release_soot_jimple_toolkits_thread_synchronization_LockAllocator() {
    	instance_soot_jimple_toolkits_thread_synchronization_LockAllocator = null;
    }

    private soot.jimple.toolkits.thread.mhp.MhpTransformer instance_soot_jimple_toolkits_thread_mhp_MhpTransformer;
    public soot.jimple.toolkits.thread.mhp.MhpTransformer soot_jimple_toolkits_thread_mhp_MhpTransformer() {
        if (instance_soot_jimple_toolkits_thread_mhp_MhpTransformer == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_thread_mhp_MhpTransformer == null)
	        		instance_soot_jimple_toolkits_thread_mhp_MhpTransformer = new soot.jimple.toolkits.thread.mhp.MhpTransformer(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_thread_mhp_MhpTransformer;
    }
    protected void release_soot_jimple_toolkits_thread_mhp_MhpTransformer() {
    	instance_soot_jimple_toolkits_thread_mhp_MhpTransformer = null;
    }

    private soot.JastAddInitialResolver instance_soot_JastAddInitialResolver;
    public soot.JastAddInitialResolver soot_JastAddInitialResolver() {
        if (instance_soot_JastAddInitialResolver == null) {
	       	synchronized (this) {
		        if (instance_soot_JastAddInitialResolver == null)
	        		instance_soot_JastAddInitialResolver = new soot.JastAddInitialResolver(g);
	       	}
       	}
        return instance_soot_JastAddInitialResolver;
    }
    protected void release_soot_JastAddInitialResolver() {
    	instance_soot_JastAddInitialResolver = null;
    }

    private soot.jimple.toolkits.annotation.j5anno.AnnotationGenerator instance_soot_jimple_toolkits_annotation_j5anno_AnnotationGenerator;
    public soot.jimple.toolkits.annotation.j5anno.AnnotationGenerator soot_jimple_toolkits_annotation_j5anno_AnnotationGenerator() {
        if (instance_soot_jimple_toolkits_annotation_j5anno_AnnotationGenerator == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_annotation_j5anno_AnnotationGenerator == null)
	        		instance_soot_jimple_toolkits_annotation_j5anno_AnnotationGenerator = new soot.jimple.toolkits.annotation.j5anno.AnnotationGenerator(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_annotation_j5anno_AnnotationGenerator;
    }
    protected void release_soot_jimple_toolkits_annotation_j5anno_AnnotationGenerator() {
    	instance_soot_jimple_toolkits_annotation_j5anno_AnnotationGenerator = null;
    }

    private soot.sootify.TemplatePrinter instance_soot_sootify_TemplatePrinter;
    public soot.sootify.TemplatePrinter soot_sootify_TemplatePrinter() {
        if (instance_soot_sootify_TemplatePrinter == null) {
	       	synchronized (this) {
		        if (instance_soot_sootify_TemplatePrinter == null)
	        		instance_soot_sootify_TemplatePrinter = new soot.sootify.TemplatePrinter(g);
	       	}
       	}
        return instance_soot_sootify_TemplatePrinter;
    }
    protected void release_soot_sootify_TemplatePrinter() {
    	instance_soot_sootify_TemplatePrinter = null;
    }

    private soot.dexpler.DexResolver instance_soot_dexpler_DexResolver;
    public soot.dexpler.DexResolver soot_dexpler_DexResolver() {
        if (instance_soot_dexpler_DexResolver == null) {
	       	synchronized (this) {
		        if (instance_soot_dexpler_DexResolver == null)
	        		instance_soot_dexpler_DexResolver = new soot.dexpler.DexResolver(g);
	       	}
       	}
        return instance_soot_dexpler_DexResolver;
    }
    protected void release_soot_dexpler_DexResolver() {
    	instance_soot_dexpler_DexResolver = null;
    }

    private soot.jimple.toolkits.scalar.EmptySwitchEliminator instance_soot_jimple_toolkits_scalar_EmptySwitchEliminator;
    public soot.jimple.toolkits.scalar.EmptySwitchEliminator soot_jimple_toolkits_scalar_EmptySwitchEliminator() {
        if (instance_soot_jimple_toolkits_scalar_EmptySwitchEliminator == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_scalar_EmptySwitchEliminator == null)
	        		instance_soot_jimple_toolkits_scalar_EmptySwitchEliminator = new soot.jimple.toolkits.scalar.EmptySwitchEliminator(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_scalar_EmptySwitchEliminator;
    }
    protected void release_soot_jimple_toolkits_scalar_EmptySwitchEliminator() {
    	instance_soot_jimple_toolkits_scalar_EmptySwitchEliminator = null;
    }

    private soot.toDex.SynchronizedMethodTransformer instance_soot_toDex_SynchronizedMethodTransformer;
    public soot.toDex.SynchronizedMethodTransformer soot_toDex_SynchronizedMethodTransformer() {
        if (instance_soot_toDex_SynchronizedMethodTransformer == null) {
	       	synchronized (this) {
		        if (instance_soot_toDex_SynchronizedMethodTransformer == null)
	        		instance_soot_toDex_SynchronizedMethodTransformer = new soot.toDex.SynchronizedMethodTransformer(g);
	       	}
       	}
        return instance_soot_toDex_SynchronizedMethodTransformer;
    }
    protected void release_soot_toDex_SynchronizedMethodTransformer() {
    	instance_soot_toDex_SynchronizedMethodTransformer = null;
    }

    private soot.toDex.TrapSplitter instance_soot_toDex_TrapSplitter;
    public soot.toDex.TrapSplitter soot_toDex_TrapSplitter() {
        if (instance_soot_toDex_TrapSplitter == null) {
	       	synchronized (this) {
		        if (instance_soot_toDex_TrapSplitter == null)
	        		instance_soot_toDex_TrapSplitter = new soot.toDex.TrapSplitter(g);
	       	}
       	}
        return instance_soot_toDex_TrapSplitter;
    }
    protected void release_soot_toDex_TrapSplitter() {
    	instance_soot_toDex_TrapSplitter = null;
    }

    private soot.toDex.FastDexTrapTightener instance_soot_toDex_FastDexTrapTightener;
    public soot.toDex.FastDexTrapTightener soot_toDex_FastDexTrapTightener() {
        if (instance_soot_toDex_FastDexTrapTightener == null) {
	       	synchronized (this) {
		        if (instance_soot_toDex_FastDexTrapTightener == null)
	        		instance_soot_toDex_FastDexTrapTightener = new soot.toDex.FastDexTrapTightener(g);
	       	}
       	}
        return instance_soot_toDex_FastDexTrapTightener;
    }
    protected void release_soot_toDex_FastDexTrapTightener() {
    	instance_soot_toDex_FastDexTrapTightener = null;
    }

    private soot.jimple.toolkits.base.RenameDuplicatedClasses instance_soot_jimple_toolkits_base_RenameDuplicatedClasses;
    public soot.jimple.toolkits.base.RenameDuplicatedClasses soot_jimple_toolkits_base_RenameDuplicatedClasses() {
        if (instance_soot_jimple_toolkits_base_RenameDuplicatedClasses == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_base_RenameDuplicatedClasses == null)
	        		instance_soot_jimple_toolkits_base_RenameDuplicatedClasses = new soot.jimple.toolkits.base.RenameDuplicatedClasses(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_base_RenameDuplicatedClasses;
    }
    protected void release_soot_jimple_toolkits_base_RenameDuplicatedClasses() {
    	instance_soot_jimple_toolkits_base_RenameDuplicatedClasses = null;
    }

    private soot.jimple.toolkits.typing.fast.Integer127Type instance_soot_jimple_toolkits_typing_fast_Integer127Type;
    public soot.jimple.toolkits.typing.fast.Integer127Type soot_jimple_toolkits_typing_fast_Integer127Type() {
        if (instance_soot_jimple_toolkits_typing_fast_Integer127Type == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_typing_fast_Integer127Type == null)
	        		instance_soot_jimple_toolkits_typing_fast_Integer127Type = new soot.jimple.toolkits.typing.fast.Integer127Type(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_typing_fast_Integer127Type;
    }
    protected void release_soot_jimple_toolkits_typing_fast_Integer127Type() {
    	instance_soot_jimple_toolkits_typing_fast_Integer127Type = null;
    }

    private soot.jimple.toolkits.typing.fast.Integer1Type instance_soot_jimple_toolkits_typing_fast_Integer1Type;
    public soot.jimple.toolkits.typing.fast.Integer1Type soot_jimple_toolkits_typing_fast_Integer1Type() {
        if (instance_soot_jimple_toolkits_typing_fast_Integer1Type == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_typing_fast_Integer1Type == null)
	        		instance_soot_jimple_toolkits_typing_fast_Integer1Type = new soot.jimple.toolkits.typing.fast.Integer1Type(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_typing_fast_Integer1Type;
    }
    protected void release_soot_jimple_toolkits_typing_fast_Integer1Type() {
    	instance_soot_jimple_toolkits_typing_fast_Integer1Type = null;
    }

    private soot.jimple.toolkits.typing.fast.Integer32767Type instance_soot_jimple_toolkits_typing_fast_Integer32767Type;
    public soot.jimple.toolkits.typing.fast.Integer32767Type soot_jimple_toolkits_typing_fast_Integer32767Type() {
        if (instance_soot_jimple_toolkits_typing_fast_Integer32767Type == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_typing_fast_Integer32767Type == null)
	        		instance_soot_jimple_toolkits_typing_fast_Integer32767Type = new soot.jimple.toolkits.typing.fast.Integer32767Type(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_typing_fast_Integer32767Type;
    }
    protected void release_soot_jimple_toolkits_typing_fast_Integer32767Type() {
    	instance_soot_jimple_toolkits_typing_fast_Integer32767Type = null;
    }

    private soot.jimple.toolkits.typing.fast.BottomType instance_soot_jimple_toolkits_typing_fast_BottomType;
    public soot.jimple.toolkits.typing.fast.BottomType soot_jimple_toolkits_typing_fast_BottomType() {
        if (instance_soot_jimple_toolkits_typing_fast_BottomType == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_typing_fast_BottomType == null)
	        		instance_soot_jimple_toolkits_typing_fast_BottomType = new soot.jimple.toolkits.typing.fast.BottomType(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_typing_fast_BottomType;
    }
    protected void release_soot_jimple_toolkits_typing_fast_BottomType() {
    	instance_soot_jimple_toolkits_typing_fast_BottomType = null;
    }

    private soot.dexpler.TrapMinimizer instance_soot_dexpler_TrapMinimizer;
    public soot.dexpler.TrapMinimizer soot_dexpler_TrapMinimizer() {
        if (instance_soot_dexpler_TrapMinimizer == null) {
	       	synchronized (this) {
		        if (instance_soot_dexpler_TrapMinimizer == null)
	        		instance_soot_dexpler_TrapMinimizer = new soot.dexpler.TrapMinimizer(g);
	       	}
       	}
        return instance_soot_dexpler_TrapMinimizer;
    }
    protected void release_soot_dexpler_TrapMinimizer() {
    	instance_soot_dexpler_TrapMinimizer = null;
    }

    private soot.toolkits.scalar.SmartLocalDefsPool instance_soot_toolkits_scalar_SmartLocalDefsPool;
    public soot.toolkits.scalar.SmartLocalDefsPool soot_toolkits_scalar_SmartLocalDefsPool() {
        if (instance_soot_toolkits_scalar_SmartLocalDefsPool == null) {
	       	synchronized (this) {
		        if (instance_soot_toolkits_scalar_SmartLocalDefsPool == null)
	        		instance_soot_toolkits_scalar_SmartLocalDefsPool = new soot.toolkits.scalar.SmartLocalDefsPool(g);
	       	}
       	}
        return instance_soot_toolkits_scalar_SmartLocalDefsPool;
    }
    protected void release_soot_toolkits_scalar_SmartLocalDefsPool() {
    	instance_soot_toolkits_scalar_SmartLocalDefsPool = null;
    }

    private soot.jimple.spark.internal.PublicAndProtectedAccessibility instance_soot_jimple_spark_internal_PublicAndProtectedAccessibility;
    public soot.jimple.spark.internal.PublicAndProtectedAccessibility soot_jimple_spark_internal_PublicAndProtectedAccessibility() {
        if (instance_soot_jimple_spark_internal_PublicAndProtectedAccessibility == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_spark_internal_PublicAndProtectedAccessibility == null)
	        		instance_soot_jimple_spark_internal_PublicAndProtectedAccessibility = new soot.jimple.spark.internal.PublicAndProtectedAccessibility(g);
	       	}
       	}
        return instance_soot_jimple_spark_internal_PublicAndProtectedAccessibility;
    }
    protected void release_soot_jimple_spark_internal_PublicAndProtectedAccessibility() {
    	instance_soot_jimple_spark_internal_PublicAndProtectedAccessibility = null;
    }

    private soot.jimple.spark.internal.CompleteAccessibility instance_soot_jimple_spark_internal_CompleteAccessibility;
    public soot.jimple.spark.internal.CompleteAccessibility soot_jimple_spark_internal_CompleteAccessibility() {
        if (instance_soot_jimple_spark_internal_CompleteAccessibility == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_spark_internal_CompleteAccessibility == null)
	        		instance_soot_jimple_spark_internal_CompleteAccessibility = new soot.jimple.spark.internal.CompleteAccessibility(g);
	       	}
       	}
        return instance_soot_jimple_spark_internal_CompleteAccessibility;
    }
    protected void release_soot_jimple_spark_internal_CompleteAccessibility() {
    	instance_soot_jimple_spark_internal_CompleteAccessibility = null;
    }

    private soot.jimple.toolkits.reflection.ConstantInvokeMethodBaseTransformer instance_soot_jimple_toolkits_reflection_ConstantInvokeMethodBaseTransformer;
    public soot.jimple.toolkits.reflection.ConstantInvokeMethodBaseTransformer soot_jimple_toolkits_reflection_ConstantInvokeMethodBaseTransformer() {
        if (instance_soot_jimple_toolkits_reflection_ConstantInvokeMethodBaseTransformer == null) {
	       	synchronized (this) {
		        if (instance_soot_jimple_toolkits_reflection_ConstantInvokeMethodBaseTransformer == null)
	        		instance_soot_jimple_toolkits_reflection_ConstantInvokeMethodBaseTransformer = new soot.jimple.toolkits.reflection.ConstantInvokeMethodBaseTransformer(g);
	       	}
       	}
        return instance_soot_jimple_toolkits_reflection_ConstantInvokeMethodBaseTransformer;
    }
    protected void release_soot_jimple_toolkits_reflection_ConstantInvokeMethodBaseTransformer() {
    	instance_soot_jimple_toolkits_reflection_ConstantInvokeMethodBaseTransformer = null;
    }

    private soot.jbco.jimpleTransformations.ClassRenamer instance_soot_jbco_jimpleTransformations_ClassRenamer;
    public soot.jbco.jimpleTransformations.ClassRenamer soot_jbco_jimpleTransformations_ClassRenamer() {
        if (instance_soot_jbco_jimpleTransformations_ClassRenamer == null) {
	       	synchronized (this) {
		        if (instance_soot_jbco_jimpleTransformations_ClassRenamer == null)
	        		instance_soot_jbco_jimpleTransformations_ClassRenamer = new soot.jbco.jimpleTransformations.ClassRenamer(g);
	       	}
       	}
        return instance_soot_jbco_jimpleTransformations_ClassRenamer;
    }
    protected void release_soot_jbco_jimpleTransformations_ClassRenamer() {
    	instance_soot_jbco_jimpleTransformations_ClassRenamer = null;
    }

    private soot.jbco.jimpleTransformations.MethodRenamer instance_soot_jbco_jimpleTransformations_MethodRenamer;
    public soot.jbco.jimpleTransformations.MethodRenamer soot_jbco_jimpleTransformations_MethodRenamer() {
        if (instance_soot_jbco_jimpleTransformations_MethodRenamer == null) {
	       	synchronized (this) {
		        if (instance_soot_jbco_jimpleTransformations_MethodRenamer == null)
	        		instance_soot_jbco_jimpleTransformations_MethodRenamer = new soot.jbco.jimpleTransformations.MethodRenamer(g);
	       	}
       	}
        return instance_soot_jbco_jimpleTransformations_MethodRenamer;
    }
    protected void release_soot_jbco_jimpleTransformations_MethodRenamer() {
    	instance_soot_jbco_jimpleTransformations_MethodRenamer = null;
    }
}