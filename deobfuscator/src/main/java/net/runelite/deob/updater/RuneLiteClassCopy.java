package net.runelite.deob.updater;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.Method;
import net.runelite.asm.Type;

public class RuneLiteClassCopy
{
	private static final Logger logger = LoggerFactory.getLogger(RuneLiteClassCopy.class);

	private static final List<String> runeLiteOverrideAnnotatedMethods = List.of(
		"equals",
		"hashCode",
		"hasNext",
		"next",

		"getOption",
		"setOption",
		"getTarget",
		"setTarget",
		"getType",
		"setType",
		"getMenuAction",
		"getOpcode",
		"setOpcode",
		"getIdentifier",
		"setIdentifier",
		"getParam0",
		"setParam0",
		"getActionParam0",
		"setActionParam0",
		"getActionParam1",
		"setActionParam1",
		"isDeprioritized",
		"setDeprioritized",
		"setParent",
		"getParent",
		"isForceLeftClick",
		"setForceLeftClick",
		"onClick",
		"isItemOp",
		"getItemOp",
		"getItemId",
		"getWidget",
		"getNpc",
		"getPlayer",
		"getActor",
		"toString",

		"getPixels",
		"getWidth",
		"getHeight",
		"fillRectangle",
		"rasterFlat",
		"setRasterGouraudLowRes",
		"rasterGouraud"
	);

	private static final Type overrideType = new Type("Ljava/lang/Override;");

	public void copy(ClassGroup namedGroup, ClassGroup targetGroup)
	{
		namedGroup.buildClassGraph();
		namedGroup.lookup();

		// Copy reflection class
		ClassFile reflectionCF = namedGroup.findClass("net/runelite/rs/Reflection");
		if (reflectionCF != null)
		{
			logger.info("copy class: {}", reflectionCF.getName());
			targetGroup.addClass(reflectionCF);
		}

		// Copy RuneLite classes
		for (ClassFile classFile : namedGroup.getClasses())
		{
			if (classFile.getName().startsWith("RuneLite"))
			{
				for (Method method : classFile.getMethods())
				{
					if (runeLiteOverrideAnnotatedMethods.contains(method.getName()))
					{
						logger.info("add annotation to method: {}", method);
						method.addAnnotation(overrideType);
					}
				}
				logger.info("copy class: {}", classFile.getName());
				targetGroup.addClass(classFile);
			}
		}
	}
}
